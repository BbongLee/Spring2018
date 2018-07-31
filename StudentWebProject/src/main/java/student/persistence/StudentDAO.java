package student.persistence;

import java.util.List;

import student.domain.StudentVO;

//영속성관리 => 파일처리나 DB처리
//DAO : Data Ac cess Object
//CRUD 처리 기본
public interface StudentDAO {
	public void create(StudentVO studentVO);
	
	public StudentVO selectById(String id);
	
	public void update(StudentVO studentVO);
	
	public void delete(String id);
	
	public List<StudentVO> selectAll();
	
}
