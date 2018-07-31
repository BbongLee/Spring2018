package com.mvc.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.domain.ProductVO;

@Controller
public class TestController3 {
	//http://localhost:8080/exam1/doAAA?name=hong
	//result2.jsp에  name이 전달됨
	//@ModelAttribute는 요청 파라미터를 받아서 뷰(jsp페이지)까지 전달함!!!
	@RequestMapping("/doAAA")
	public String doAAA(@ModelAttribute("name") String name) {
		System.out.println("doAAA 실행됨 .. . ");
		System.out.println("name="+name);
		return "result2";
	}
	
	//컨트롤러에서 만들어지는 결과 데이터를 뷰에 ㅈ전달!
	//Model에 컨트롤러에서 만들어진 데이터를 추가해서 뷰에 전달함
	@RequestMapping("/doBBB")
	public String doBBB(Model model) {
		System.out.println("doBBB실행됨!");
		model.addAttribute("result", "doBBB실헹결과입ㄴ디다.");
		
		return "result3";
	}
	
	//컨트롤러에서 만들어진 결과데이터를 뷰에 전달
	//Model에 컨트롤러에서 만들어진 데이터를 추가해서 뷰에 전달함
	@RequestMapping("/doCCC")
	public String doCCC(Model model) {
		System.out.println("doCCC실행됨!!");
		
		ProductVO productVO = new ProductVO("갤노트9", 1000000);
		model.addAttribute("product", productVO);
		
		return "product/result";
	}
	
	//컨트롤러에서 만들어진 결과데이터를 뷰에 전달
		//Model에 컨트롤러에서 만들어진 데이터를 추가해서 뷰에 전달함
	//Model로 이름없이 객체를 전달할 때: 클래스 이름의 첫번째글자만 소문자=>객체이름
		@RequestMapping("/doDDD")
		public String doDDD(Model model) {
			System.out.println("doDDD실행됨!!");
			
			ProductVO productVO = new ProductVO("갤노트9", 1000000);
			model.addAttribute(productVO);
			
			return "product/result2";
		}
}
