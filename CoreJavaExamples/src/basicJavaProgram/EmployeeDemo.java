package basicJavaProgram;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("Yuvaraj");
		e1.setSalary(100000.0d);
		e1.setCity("Bengaluru");
		
		System.out.println(e1);
		
		Employee e2 = new Employee();
		e2.setEid(101);
		e2.setEname("Renuga");
		e2.setSalary(100000.0d);
		e2.setCity("vellore");
		
		System.out.println(e2);
		
		Employee e3 = new Employee();
		e3.setEid(101);
		e3.setEname("Gokul");
		e3.setSalary(100000.0d);
		e3.setCity("Puducherry");
		
		System.out.println(e3);
		
		Employee e4 = new Employee();
		e4.setEid(101);
		e4.setEname("Siva");
		e4.setSalary(100000.0d);
		e4.setCity("Chennai");
		
		System.out.println(e4);
	}

}