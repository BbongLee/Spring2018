package test3;

import org.springframework.stereotype.Component;

@Component //�ڵ����� ������Ʈ �������
public class ProductDaoImpl implements ProductDao {

	@Override
	public Product getProduct() {
		// �����δ� ���⼭ DBó�� ��
		return new Product("����", 100);
	}

}
