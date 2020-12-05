package exercise3;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.logging.Logger;

public class CollectionExamples {
	private final static Logger log = Logger.getLogger(CollectionExamples.class.getName());
	
	public static void main(String[] args) {

		//List
		List<Sample> ls = new ArrayList<Sample>();
		for (int i = 0; i< 10; i++ ) {
			ls.add(new Sample(i, "A", SampleType.valueOf("SAMPLE_TO_EAT")));
		}
		log.info("Testing List :"+ls.toString());
		
		//Hashtable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Hash 1");
		ht.put(2, "Hash 2");
		
		
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(3, "Map 3");
		
		ht.putAll(myMap);
		log.info("Testing Hashmap : "+ ht.toString());
		
		//Queue from LinkedList
		Queue<String> q = new LinkedList<String> ();
		q.add("Q2");
		q.add("Q1");
		
		q.add("Q3");
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
		System.out.println(q.size());
		
		
	}
}


class Sample {
	int id;
	String name;
	SampleType type;
	
	Sample(int id, String name, SampleType type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "[Id: "+id+" Name: "+name+ " SampleType:"+type+"]";
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		else if (!(obj instanceof Sample)) {
			return false;
		}
		Sample s = (Sample)obj;
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(this.id);
	}
	
}

enum SampleType {
	SAMPLE_TO_EAT(1),
	SAMPLE_TO_GO(2);
	
	private int typeCode;
	
	SampleType(int typeCode) {
		this.typeCode = typeCode;
	}
	
	public int getTypeCode() {
		return typeCode;
	}
	
}

