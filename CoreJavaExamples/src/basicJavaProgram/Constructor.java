package basicJavaProgram;

public class Constructor {
	private int sid;
	private String sname;
	private String course;
	
	public Constructor(){
		this.sid = 100;
		this.sname = "Yuva";
		this.course = "Java";
		System.out.println("Default Constructor has been called.");
		
	}
	
	public Constructor(int sid, String sname, String course) {
		this();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Constructor Example [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
	}
}