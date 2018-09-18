package Zadatak5;

import java.util.Scanner;

public class Ipis {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean prekini = false;
		String recenica = "";

		while (!prekini) {
			System.out.print("Unesi rijec: ");
			String rijec = scanner.next();

			if (rijec.equals("kraj")) {
				prekini = true;
			} else {
				recenica = recenica + rijec + " ";
			}
		}

		System.out.println("Rijeci koje ste unijeli: " + recenica);

	}
}
