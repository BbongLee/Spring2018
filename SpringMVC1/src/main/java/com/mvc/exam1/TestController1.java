package com.mvc.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController1 {

	// 반환형이 void인 경우
	// 요청 결과 화면(일반적으로 jsp)은 요청 경로(RequestMapping)에
	// 해당하는 jsp파일이 실행됨
	// jsp 파일의 경로는 servlet-context.xml파일의 ViewResolver에 설정되있음
	// 우히히ㅣ 가나다라마바사아자차카타파하 abcedfghijklmnopqrstuvwxyz
	
	//http://localhost:8080/exam1/doA 사용자가 요청하면
	// doA.jsp가 서비스됨
	@RequestMapping("/doA")
	public void doA() {
		System.out.println("doA 실행됨!! !  ! !");
	}
	
	@RequestMapping("/aaa")
	public void aaa() {
		System.out.println("aaa 실행됨!! !  ! !");
	}
}
