package student.domain;

import java.util.Date;

//학생 한명에 대한 정보를 가지고 있는 Value Object
public class StudentVO {

	private String id;
	private String name;
	private String password;
	private String email;
	private Date regdate;
	
	public StudentVO() {
		
	}
	
	public StudentVO(String id, String name, String password, String email, Date regdate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.regdate = regdate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", regdate="
				+ regdate + "]";
	}
	
	
}
