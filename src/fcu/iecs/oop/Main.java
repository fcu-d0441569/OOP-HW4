package fcu.iecs.oop;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str1;
		PasswordEncorder pass1 = new PasswordEncorder();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pleace input the sentence:");
		str1 = scanner.next();
		pass1.transform(str1);

	}

}
