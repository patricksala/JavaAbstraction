package abstractTest1Pack;
import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter greeting: ");
		System.out.println("");
		
		String greetInput = scanner.nextLine();
		XYZ xyz = new XYZ();
		xyz.FOO();
		System.out.print(xyz.DAY(greetInput));
		scanner.close();

	}

}