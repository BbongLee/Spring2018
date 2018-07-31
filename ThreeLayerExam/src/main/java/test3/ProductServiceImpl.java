package test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")
public class ProductServiceImpl implements ProductService {

	//서비스 레이어는 DAO레이어에 의존함
	@Autowired //프로덕트 다오타입을 자동주입!!!!!!!!!!!!!!!!!!!!!!!!! set안써도도딤,,,,
	private ProductDao productDao;

	//세터를 통한 DAO주입
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}



	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return productDao.getProduct(); //위임
	}

}
