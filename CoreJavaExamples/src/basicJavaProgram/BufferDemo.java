package basicJavaProgram;
import java.io.*;
public class BufferDemo {

	public static void main(String[] args) throws IOException {
		
		int eid;
		String ename;
		double salary;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Employee details:");
		eid = Integer.parseInt(br.readLine());
		ename = br.readLine();
		salary = Double.parseDouble(br.readLine());
		
		System.out.println("Employee Id: "+eid);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+salary);
		
	}

}