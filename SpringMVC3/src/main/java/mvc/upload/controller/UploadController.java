package mvc.upload.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	//업로드 된 파일을 저장할 경로를 주입함
	@Resource(name="uploadPath")
	private String uploadPath;
	
	//private String uploadPath = "c:\\upload";
	
	@RequestMapping(value="/uploadForm", method=RequestMethod.GET)
	public String uploadForm() {
		return "uploadForm";
	}
	
	//MultipartFile은 업로드된 파일 데이터를 말함
	@RequestMapping(value="/uploadForm", method=RequestMethod.POST)
	public String uploadForm1(MultipartFile file, Model model) throws IOException, Exception {
		//업로드된 파일이름
		System.out.println("파일 원본 이름 : "+ file.getOriginalFilename());
		//업로드 된 파일 크기
		System.out.println("파일 크기 : "+ file.getSize());
		//업로드 된 파일의 MIME타입
		System.out.println("파일의 ContentType : "+ file.getContentType());
		
		//업로드 된 파일이 있으면
		if(file.getSize()>0) {
			//file.getBytes() : 업로드 된 파일의 내용을 byte[]로 가져옴
			String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());
			
			model.addAttribute("savedName", savedName);
			model.addAttribute("originalName", file.getOriginalFilename());
			
		}
		
		return "uploadResult";
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
	
	//보통 String 반환형으로 JSP파일을 반환했다. but 이건 아님! 뷰를 만들어 내지 않고, 
	//대신 데이터 자체를 반환함을 의미!!
	//이때 주로 반환되는 데이터는 단순 문자열, JSON, XML등이다!
	//근데 우리 예제에서는 
	@ResponseBody //ResponseEntity<byte[]> 클라이언트에게 응답하는 리턴 타입!!
	@RequestMapping(value="/displayFile", method=RequestMethod.GET)
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
	
}