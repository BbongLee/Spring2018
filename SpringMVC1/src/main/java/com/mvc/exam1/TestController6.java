package com.mvc.exam1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.domain.MemberVO;

@Controller
public class TestController6 {
	
	//@RequestMapping("/methodTest")요청은 get, post방식의 요청을 다 처리함
	@RequestMapping("/methodTest")
	public void methodTest() {
		
		System.out.println("methodTest 실행됨. . .");
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String doPost(Model model) {
		System.out.println("/doPost 가 실행됨 ! ! ! ");
		//model   컨트롤러에서 정ㅇ보 붙여서 맵까지?
		model.addAttribute("method", "post");
		
		return "resultPage";
		
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.GET)
	public String doGet(Model model) {
		System.out.println("/doGet 가 실행됨 ! ! ! ");
		//model   컨트롤러에서 정ㅇ보 붙여서 맵까지?
		model.addAttribute("method", "get");
		
		return "resultPage";
		
	}
	// exam1/member => memberForm.jsp보여쥬ㅜㅁ
	@RequestMapping(value="/member", method=RequestMethod.GET)
	public String memberGet() {
		System.out.println("member getㅅ실행도미!!!");
		return "member/memberForm";
	}
	
	@RequestMapping(value="/member", method=RequestMethod.POST)
	public String memberPost(MemberVO memberVO, Model model) {
		System.out.println("memberPost실행됨!!!");
		
		int age = memberVO.getAge();
		String result="";
		
		if(age<20)
			result="미성년자입니다";
		else
			result="성년입니다";
		
		model.addAttribute("result", result);
		return "member/memberResult";
	}
	
}
