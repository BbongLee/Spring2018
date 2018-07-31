package mybatisExam;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test1 {

	private SqlSession sqlSession;

	public Test1(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}
	
	public void selectOne(){
		int count = sqlSession.selectOne("exam.test.SingerMapper.getSingerCount");
	System.out.println("±×·ì ¼ö : "+count);	
	}
	public static void main(String[] args){
		ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");
		Test1 t = ctx.getBean("test1", Test1.class);
		t.selectOne();
	}
	
}
