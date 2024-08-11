package basicJavaProgram;
import java.util.Scanner;
public class AdditionDemo {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the trainer name:");
		String name;
		name = sc.nextLine();
		c = a+b;
		System.out.println("Addition of a = "+a+" and b= "+b+" is "+c);
		System.out.println("Tech Trainer:"+name);
		sc.close();

	}
}