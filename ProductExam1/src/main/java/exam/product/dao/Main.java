package exam.product.dao;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import exam.product.service.ProductService;
import exam.product.service.ProductServiceImpl;
import exam.product.ui.ProductUI;
import exam.product.vo.ProductVo;

public class Main {

	public static void main(String[] args) {
//		ProductDao productDao = new ProductDaoImpl();
//		ProductService productService = new ProductServiceImpl(productDao);
//		ProductUI productUI = new ProductUI();
//		productUI.setProductService(productService);
//		productUI.showMenu();

		ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");
		
		ProductUI productUI = (ProductUI)ctx.getBean("productUI");
		productUI.showMenu();
		
	}

}
