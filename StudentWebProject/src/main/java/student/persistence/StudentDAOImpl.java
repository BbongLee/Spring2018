package student.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import student.domain.StudentVO;

@Repository //저장고. db  대신 @Component 도 가능
public class StudentDAOImpl implements StudentDAO {

	
	@Autowired //자동주입!!
	//StudentDAOImpl은 mybatis의 sqlSession에 의존함
	private SqlSession sqlSession;
	
	private static String namespace = "com.student.mapper.StudentMapper";
	
	public StudentDAOImpl() {
	}
	
	//생성자를 이용한 sqlSession을 주입함
	public StudentDAOImpl(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}

	@Override
	public void create(StudentVO studentVO) {
		sqlSession.insert(namespace+".create", studentVO);
	}

	@Override
	public StudentVO selectById(String id) {
		List<StudentVO> students = sqlSession.selectList(namespace+".selectById", id);
		
		return students.isEmpty() ? null : students.get(0);
	}

	@Override
	public void update(StudentVO studentVO) {
		sqlSession.update(namespace+".update", studentVO);

	}

	@Override
	public void delete(String id) {
		sqlSession.delete(namespace+".delete", id);

	}

	@Override
	public List<StudentVO> selectAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".selectAll");
	}

}
