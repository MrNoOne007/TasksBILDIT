package Zadatak3;

public class Array {

	private int[] array;

	public Array() {

	}

	public Array(int[] array) {
		super();
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getSmallestElement() {
		int Smallest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < Smallest) {
				Smallest = array[i];
			}
		}
		return Smallest;

	}

	public int getLargestElement() {
		int Largest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > Largest) {
				Largest = array[i];
			}
		}
		return Largest;
	}

	public int SumaAllElements() {
		int[] array = getArray();
		int suma = 0;

		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}

		return suma;
	}

	public void printAll() {

		int[] array = getArray();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
