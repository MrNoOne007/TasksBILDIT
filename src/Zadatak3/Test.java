package Zadatak3;

public class Test {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 14;
		intArray[1] = 19;
		intArray[2] = 7;
		intArray[3] = 32;
		intArray[4] = 6;
		
		Array array = new Array (intArray);
		
		System.out.println("Najmanji element je: " + array.getSmallestElement());
		System.out.println("Najveci element je: " + array.getLargestElement());
		System.out.println("Suma svih elemenata je: " + array.SumaAllElements());
		System.out.print("Elementi niza su: ");
		array.printAll();
	}


	}


