package basicJavaProgram;
import java.util.Scanner;
public class InputOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String n = sc.nextLine();
		System.out.println("Hello " + n);
		sc.close();
	}
}
