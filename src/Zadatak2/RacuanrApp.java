package Zadatak2;

import java.util.Scanner;

public class RacuanrApp {

	public static void main(String[] args) {

		Racunar racunar = new Racunar(10, 500, 2.8, 24.2, 800.50);
		Laptop laptop = new Laptop(4, 250, 2, 15, 450, 2.5);

		System.out.println(racunar.toString());
		System.out.println(racunar.IzracunajCijenu());

		System.out.println();
		System.out.println(laptop.toString());
		System.out.println(laptop.IzracunajCijenu());

	}

}
