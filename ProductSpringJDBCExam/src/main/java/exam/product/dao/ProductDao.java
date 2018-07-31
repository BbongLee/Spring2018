package exam.product.dao;

import java.util.Collection;

import exam.product.vo.ProductVo;

//DAO(Data Access Object)
// ���Ӽ� ó��(DB, Fileó��....)
//CRUD, Create(insert), Read(select), Update, Delete =>���� �⺻!!
public interface ProductDao {
	
	// read
	public ProductVo selectById(String id);
	//create
	public void insert(ProductVo product);
	//update
	public void update(ProductVo product);
	//delete
	public void delete(String id);
	//all read
	public Collection<ProductVo> selectAll();
}
