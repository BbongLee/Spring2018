package exam.product.dao;

import java.util.Collection;

import exam.product.vo.ProductVo;

//DAO(Data Access Object)
// 康加己 贸府(DB, File贸府....)
//CRUD, Create(insert), Read(select), Update, Delete =>昆狼 扁夯!!
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
