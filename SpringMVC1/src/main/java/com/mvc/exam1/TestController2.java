package com.mvc.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController2 {

	// 반환형이 String인 경우
	// 요청 결과 화면은 return 뒤의 "문자열.jsp"파일이 실행됨
	//jsp파일의 경로는 servlet-context.xml 파일의 ViewResolver에 설정되어 있음
	
	//http://localhost:8080/exam1/doAA
	//화면 : test.jsp
	@RequestMapping("/doAA")
	public String doAA() {
		System.out.println("doAA 실행됨!! !  ! !");
		return "test";
	}
	
	// http://localhost:8080/exam1/doCC?num=10
	//메소드의 매개변수가 있을 경우
	//매갭ㄴ수가 요청 파라미터(RequestParameter)역할을 함
	//그러나 이 요청 파라미터는 view (jsp페이지)페이지에는 전달이 안됨!!
	@RequestMapping("/doCC")
	public String doCC(int num) {
		System.out.println("doCC실행됨....");
		System.out.println("num= "+num);
		return "result1";
	}
	
	@RequestMapping("/doDD")
	public String doDD(@RequestParam("num")int n) {
		System.out.println("doDD실행됨....");
		System.out.println("num= "+n);
		return "result1";
	}
	//요청 파라미터 이름은 value
	//요청할 때 
	@RequestMapping("/doCC1")
	public String doCC1(
		@RequestParam(value="num", required=false, defaultValue="100")
		int num) {
		System.out.println("doCC1실행됨");
		System.out.println("num="+num);
		
		return "result1";
	}
}
