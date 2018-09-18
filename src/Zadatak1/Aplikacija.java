package Zadatak1;

import java.util.Scanner;

public class Aplikacija {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Molimo unesite ime autora:");
		String Ime = input.nextLine();
		System.out.println("Molimo unesite email autora:");
		String email = input.nextLine();
		System.out.println("Molimo unesite gender autora:");
		char gender = input.next(".").charAt(0);

		Author author = new Author(Ime, email, gender);

		System.out.println("Molimo unesite naziv knjige ");
		String name = input.nextLine();
		System.out.println("Molimo unesite cijenu knjige:");
		Double price = input.nextDouble();
		System.out.println("Molimo unesite kolicinu na stanju:");
		int qtyInStock = input.nextInt();

		Book book = new Book(name, author, price, qtyInStock);

		System.out.println(book.toString());

	}
}
