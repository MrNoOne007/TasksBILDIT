package Zadatak4;
import java.util.*;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite recenicu: ");
		String line = input.nextLine();

		input.close();
		String[] words = line.split("[ ]+");
		System.out.println("Predzadnja rijec je: " + words[words.length - 2]);
	}

	
	
}
