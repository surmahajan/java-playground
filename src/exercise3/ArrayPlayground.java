package exercise3;

import java.util.*;

public class ArrayPlayground {

	private int[] theArray = new int[50];
	private int arraySize = 10;

	public void generateRandom() {
		for (int i = 0; i <= arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10) + 10;
		}
	}

	public void printArray() {
		System.out.println("------------");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
		}
	}

	public static void main(String str[]) {
		// one-dimension array
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// array of object Student
		Student st[] = new Student[2];
		st[0] = new Student(1, "SM");
		st[1] = new Student(2, "FM");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].name);
		}

		// 2-dimensional array
		int[][] intArray = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(intArray[i][j] + " ");
			}
			System.out.println();
		}

		ArrayPlayground obj = new ArrayPlayground();

		obj.generateRandom();
		obj.printArray();

	}

	public int getValueAtIndex() {
		return arraySize;

	}

	public boolean doesArrayContainValue(int searchValue) {
		return false;

	}

}

/**
 * Object
 */
class Student {
	public int id;
	public String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "[id: " + id + " Name: " + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}