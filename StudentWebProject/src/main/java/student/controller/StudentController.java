package student.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import student.domain.StudentVO;
import student.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	//업로드 된 파일을 저장할 경로를 주입함
	@Resource(name="uploadPath")
	private String uploadPath;
	
	@RequestMapping(value="/imageList", method=RequestMethod.GET)
	public String imageListAll(Model model) {
		
		List<StudentVO> students = studentService.getStudents();
		model.addAttribute("students", students);
		
		return "student/imageList";
	}
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listAll(Model model) {
		List<StudentVO> students = studentService.getStudents();
		model.addAttribute("students",students);
		
		return "student/list";
	}
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public String registerGet() {		
		return "student/register";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String registerPost(StudentVO studentVO) throws IOException, Exception {
		//추가
		MultipartFile file = studentVO.getFile();
		//업로드 된 파일이 있으면 
		if(file.getSize()>0) {
			String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());
			studentVO.setSavedName(savedName);
		}
		studentService.registStudent(studentVO);
		
		return "redirect:/student/list";
	}
	
	@RequestMapping(value="read", method=RequestMethod.GET)
	public String read(@RequestParam("id") String id, Model model) {		
		StudentVO studentVO = studentService.getStudent(id);
		//추가
		String savedName = studentVO.getSavedName();
		String originalName = null;
		if(savedName!=null)
			originalName = savedName.substring(savedName.indexOf("_")+1);
		model.addAttribute("originalName", originalName);
		//
		model.addAttribute("student", studentVO);
		return "student/read";
	}
	
	@RequestMapping(value="modify", method=RequestMethod.GET)
	public String modifyGet(@RequestParam("id")String id, Model model) {
		StudentVO student = studentService.getStudent(id);
		model.addAttribute("student",student);
		
		return "student/modify";
	}
	
	@RequestMapping(value="modify", method=RequestMethod.POST)
	public String modifyPost(StudentVO studentVO) throws IOException, Exception {
		//추가
		MultipartFile file=studentVO.getFile();
		StudentVO oldStudent = studentService.getStudent(studentVO.getId());
		
		//수정하기 위해 업로드한 파일이 있다면
		//기존에 등록된 파일 삭제
		if(file.getSize()!=0) {
			String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());
			studentVO.setSavedName(savedName);
			String oldFileName = oldStudent.getSavedName();
			
			//이전에 등록된 사진파일이 있다면
			if(oldFileName!=null)
				new File(uploadPath, oldFileName).delete();//기존파일 삭제
		}
		//수정하기 위해 업로드 된 파일이 없다면
		//기존에 등록된 파일명 그대로 사용
		else 
		{
			String savedName = oldStudent.getSavedName();
			studentVO.setSavedName(savedName);
		}
		
		studentService.changeStudent(studentVO);
		return "redirect:/student/list";
	}
	
	@RequestMapping(value="remove", method=RequestMethod.GET)
	public String removeGet(@RequestParam("id")String id) {
		//추가
		StudentVO oldStudent = studentService.getStudent(id);
		String oldFileName = oldStudent.getSavedName();
		
		if(oldFileName!=null&&!oldFileName.equals("")) {
			new File(uploadPath, oldFileName).delete();
		}
		
		studentService.removeStudent(id);
		
		return "redirect:/student/list";
	}
	
	//서버에 저장될 파일의 이름을 만들고 클라이언트가 업로드 한 파일(byte[] bytes)을 서버의 특정 폴더에 저장함
	private String uploadFile(String originalFilename, byte[] bytes) throws Exception
	{
		//UUID : 중복되지 않는 고유한 키 값을 설정함
		UUID uid = UUID.randomUUID();
		String savedName = uid.toString()+"_"+originalFilename;
		System.out.println("savedName : " + savedName);
		
		File target = new File(uploadPath, savedName);
		//업로드된 파일 내용 bytes를 target파일에 복사
		//즉, 클라이언트가 업로드한 내용이 서버에 저장됨
		FileCopyUtils.copy(bytes, target);
		
		
		return savedName;
	}
	
	private static Map<String, MediaType> mediaType;
	
	static {
		mediaType = new HashMap<String, MediaType>();
		mediaType.put("JPG", MediaType.IMAGE_JPEG);
		mediaType.put("JPEG", MediaType.IMAGE_JPEG);
		mediaType.put("GIF", MediaType.IMAGE_GIF);
		mediaType.put("PNG", MediaType.IMAGE_PNG);
	}
	
	private MediaType getMediaType(String type){
		return mediaType.get(type.toUpperCase());
	}
	
	@ResponseBody //ResponseEntity<byte[]> 클라이언트에게 응답하는 리턴 타입!!
	@RequestMapping(value="/display", method=RequestMethod.GET)
	public ResponseEntity<byte[]> displayFile(String fileName) throws IOException{
		InputStream in = null;
		ResponseEntity<byte[]> entity = null;
		
		System.out.println("fileName : "+ fileName);
		
		try {
			//파일의 확장자 찾기
			String formatName = fileName.substring(fileName.lastIndexOf(".")+1);
			//이미지 파일일 경우 이미지 파일의 타입 찾기
			MediaType mType = getMediaType(formatName);
			HttpHeaders headers = new HttpHeaders();
			//서버에 저장된 파일을 읽을 수 있는 입력스트림 생성
			in = new FileInputStream(uploadPath+"\\"+fileName);
			
			if(mType!=null) {
				//이미지 파일일 경우 헤더에 mime타입 세팅
				headers.setContentType(mType);				
			}else {
				//이미지 파일이 아닐 경우, 브라우저에서 파일을 다운바등ㄹ 수 있게 세팅!!
				fileName = fileName.substring(fileName.indexOf("_")+1);
				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
				headers.add("Content-Disposition", "attachment; filename=\""
				+new String(fileName.getBytes("UTF-8"), "ISO-8859-1")+"\"");//한글깨짐방지
			
			}
			entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
		}finally {
			in.close();
		}
		return entity;
	}
	
}
