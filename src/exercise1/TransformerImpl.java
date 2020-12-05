package exercise1;

import java.util.ArrayList;
import java.util.List;


public class TransformerImpl implements Transformer {

	@Override
	public List<ObjectB> transform(List<ObjectA> listOfObjects) {
		
		ObjectB objB = null;
		List<ObjectB> listObjB = new ArrayList<ObjectB>();
		
		for(ObjectA objA : listOfObjects) {
			double random = Math.random();
			
			objB = new ObjectB();
			objB.setId((int) random);
			objB.setColor("red");
			objB.setAvailability(objA.isAvailability());
			objB.setWeight(getWeightInKgs(objA.getWeight()));
			listObjB.add(objB);
		}
		return listObjB;
	}
	
	private double getWeightInKgs(double weightInPounds) {
		double weightInKgs = weightInPounds * 0.453592;
		return weightInKgs;
	}

	public static void main(String str[])
	{
		List<ObjectA> objectAList = new ArrayList<ObjectA>();
		ObjectA obj1 = new ObjectA();
		obj1.setAvailability(true);
		obj1.setName("Test");
		obj1.setWeight(44);
		
		objectAList.add(obj1);
		
		ObjectA obj2 = new ObjectA();
		obj2.setAvailability(true);
		obj2.setName("Test1");
		obj2.setWeight(45);
		
		objectAList.add(obj2);
		
		Transformer t = new TransformerImpl();
		List<ObjectB> objectBList = t.transform(objectAList);
		
		for (ObjectB objB : objectBList) {
			System.out.println(objB.getWeight());
			System.out.println(objB.getId());
		}
	}

}
