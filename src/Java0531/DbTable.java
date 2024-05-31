package Java0531;

public class DbTable {

	// 테이블 정의서를 보고 필드(변수)를 선언하시오.
	private int day;
	private String rice;
	private String soup;
	private String maindish;
	private String sidedish;
	private String kimchi;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getRice() {
		return rice;
	}
	public void setRice(String rice) {
		this.rice = rice;
	}
	public String getSoup() {
		return soup;
	}
	public void setSoup(String soup) {
		this.soup = soup;
	}
	public String getMaindish() {
		return maindish;
	}
	public void setMaindish(String maindish) {
		this.maindish = maindish;
	}
	public String getSidedish() {
		return sidedish;
	}
	public void setSidedish(String sidedish) {
		this.sidedish = sidedish;
	}
	public String getKimchi() {
		return kimchi;
	}
	public void setKimchi(String kimchi) {
		this.kimchi = kimchi;
	}
	@Override
	public String toString() {
		return "DbTable [day=" + day + ", rice=" + rice + ", soup=" + soup + ", maindish=" + maindish + ", sidedish="
				+ sidedish + ", kimchi=" + kimchi + "]";
	}
	
	
}
