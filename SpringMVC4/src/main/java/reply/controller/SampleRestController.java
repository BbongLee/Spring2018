package reply.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import reply.domain.SampleVO;

//@해당 컨트롤러의 모든 뷰 처리가 JSP가 아니라는 의미
//@RestCOntroller는 jsp와 같은 뷰를 만들어 내지 않는 대신에
//데이터 자체를 클라이언트로 변환한다.
//이때 주로 반환되는 데이터는 단순문자열, JSON, XML등이다.
//@RestController를 이용해서, 결과 데이터만 서버에서 클라이언트로 제공하는 방식은 
// 예를 들어, Android나 IPhone같은 모바일 환경에서 서버의 데이터를 이용하거나
//HTML5, Ajax등을 이용한 경우에 많이 사용된다.
@RestController
public class SampleRestController {

	@RequestMapping("/hello")
	@ResponseBody //원래 .jsp를 보여주는 건데, @ResponseBody를 통해 데이터"Hello World"를 클라이언트로 보낸다는 의미
	public String sayHello() {
		
		return "Hello World";
	}
	
	//결과로 반환하는 것이 jsp페이지가 아니라 자바 객체!
	//자바 객체를 클라이언트(EX 브라우저)가 이해할 수 있는 데이터 타입으로 변환하여 보내야함
	//예를들면 자바 객체를 json타입의 데이터로 보내야 함
	//자바 객체를 JSON타입으로 변환하는 라이브러리가 필요함 => jackson-databind 라이브러리
	//jackson-databind 라이브러리는 객체를 JSON타입의 데이터로 변환하거나
	//반대로 JSON타입의 데이터를 객체로 변환하는 작업을 함
	
	@ResponseBody
	@RequestMapping("/sendVO")
	public SampleVO sandVO() {
		SampleVO vo =new SampleVO();
		vo.setFirstName("예본");
		vo.setLastName("이");
		vo.setNo(1234);
		
		return vo;		
	}
}
