package Java0529;

public class DbTable {

	// 테이블 정의서를 보고 필드(변수)를 선언하시오.
	private int no;
	private String name;
	private String sex;
	private String etc;
	private String dept;
	private String position;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "DbTable [no=" + no + ", name=" + name + ", sex=" + sex + ", etc=" + etc + ", dept=" + dept
				+ ", position=" + position + "]";
	}
}
