package test3;

import org.springframework.stereotype.Component;

@Component //자동으로 컴포넌트 만들어줌
public class ProductDaoImpl implements ProductDao {

	@Override
	public Product getProduct() {
		// 실제로는 여기서 DB처리 함
		return new Product("가위", 100);
	}

}
