package exercise3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ObjectList {

	public static void main(String str[]) {
		List<Pet> pets = new ArrayList<Pet>();
		Pet p1 = new Pet(1, "Test1");
		Pet p2 = new Pet(2, "Test2");
		Pet p3 = new Pet(3, "Test3");
		Pet p4 = new Pet(4, "Test4");
		Pet p5 = new Pet(1, "Test1");

		pets.add(p1);
		pets.add(p2);
		pets.add(p3);
		pets.add(p4);
		pets.add(p5);

		System.out.println(findDuplicate(pets));
	}

	static Set<Pet> findDuplicate(List<Pet> pets) {
		Set<Pet> finalList = new HashSet<Pet>();

		for (Pet p : pets) {
			// System.out.println(p);
			finalList.add(p);
		}
		return finalList;

	}
}

class Pet {
	private int id;
	private String type;

	public Pet(int id, String type) {
		this.id = id;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Id: " + id + "  type: " + type;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Pet)) {
			return false;
		}

		Pet pet = (Pet) o;
		return id == pet.id;
	}

	public int hashCode() {
		return (int) id * type.hashCode();
	}
}