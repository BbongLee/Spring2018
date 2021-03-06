package com.mvc.exam1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.domain.MemberVO;
import com.mvc.domain.ProductVO;

@Controller
@RequestMapping("/product")
public class TestController7 {
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String productForm() { //get : exam1/product/form
		System.out.println("/product/form 실행됨 , , ,");
		
		return "product/productForm";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerProduct(ProductVO productVO, Model model) {
		System.out.println("/product/register 실행됨, , , ");
		int price = productVO.getPrice();
		String result ="";
		
		if(price>=1000000)
			result="고가품입니다.";
		else
			result="저가품입니다.";
		
		model.addAttribute("result", result);
		
		return "product/view";
	}
	
	@RequestMapping(value="/redirect", method=RequestMethod.GET)
	public String redirect() {
		System.out.println("/product/Redirect실행딤...");
		
		return "redirect:form";
		
		// exam1/product/form
		//컨텍스트 /product/form
		
		//return "redirect:/form"
		// exam1/form
		//컨텍스트/form
	}
	
	@RequestMapping(value="/redirect2", method=RequestMethod.GET)
	public String redirect2() {
		System.out.println("/product/Redirect2실행딤...");
		
		return "redirect:http://www.naver.com";
		
	}
}
