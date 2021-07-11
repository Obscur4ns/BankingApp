package bankingApp;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("Value = " + a);
		char c = scanner.next().charAt(0);
		System.out.println("Value = " + c);
	}

}
