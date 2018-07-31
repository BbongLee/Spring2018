package exam.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.validation.BeanPropertyBindingResult;

public class SelectTest2 {
	private JdbcTemplate jdbcTemplate;

	public SelectTest2(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Singer> query(int member) { // 여러개값가져오기!!!
		String query = "select * from singer_group where member=?";

		List<Singer> singers = jdbcTemplate.query(query,
				new RowMapper<Singer>() {
					public Singer mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Singer s = new Singer();
						s.setName(rs.getString("name"));
						s.setMember(rs.getInt("member"));
						return s;
					}
				}, member);
		return singers;
	}
	
	public List<Singer> query1(int member){ ///결과 0~여러개
		String query = "select * from singer_group where member=?";
		
		List<Singer> singers = jdbcTemplate.query(query, new BeanPropertyRowMapper<Singer>(Singer.class));
		return singers;
	}
	
	public Singer queryForObject(String name){ //결과 꼭 하나
		String query = "select * from singer_group where name=?";
		Singer singer = jdbcTemplate.queryForObject(query, 
				new BeanPropertyRowMapper<Singer>(Singer.class),name);
		return singer;
	}

	public void update(String name){
		String query = "update singer_group set member=6 where name=?";
		int updateCount = jdbcTemplate.update(query, name);
		System.out.println(updateCount + "개의 레코드가 수정됨");
	}

	public void update(Singer singer){
		String query = "update singer_group set member=? where name=?";
		int updateCount = jdbcTemplate.update(query, singer.getMember(), singer.getName());
		System.out.println(updateCount + "개의 레코드가 수정됨");
	}
	
	public void insert(Singer singer){
		String query = "insert into singer_group values(?, ?)";
		int count = jdbcTemplate.update(query, singer.getName(), singer.getMember());
		
		System.out.println(count+"개의 레코드 삽입");
	}
	
	public void delete(String name){
		String query = "delete from singer_group where name=?";
		
		int count = jdbcTemplate.update(query, name);
		System.out.println(count+"개의 레코드 삭제됨");
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");

		SelectTest2 selectTest2 = ctx.getBean("selectTest2", SelectTest2.class);
		
		List<Singer> singers = selectTest2.query(7);
		for(Singer singer:singers){
			System.out.println(singer);
		}
		
		Singer singer = selectTest2.queryForObject("EXO");
		System.out.println(singer);
		
		List<Singer> singers1 = selectTest2.query(7);
		for(Singer singer1:singers1){
			System.out.println(singer1);
		}
		
		selectTest2.update("소녀시대");
		selectTest2.update(new Singer("소녀시대",7));
		selectTest2.insert(new Singer("빅뱅",5));
		selectTest2.delete("빅뱅");
	}
}
