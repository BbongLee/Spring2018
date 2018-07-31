package test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("beans2.xml");
		ProductService productService = ctx.getBean("service", ProductService.class);
		//구체적인 클래스 없당! 컴파일할때 유지보수 필요 X
		
		Product product = productService.getProduct();
		System.out.println(product); 
	}

}
