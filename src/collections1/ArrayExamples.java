package collections1;

import java.util.List;
import java.util.ArrayList;

/*
List<T>: [a, b, c, d, e, f]

getElementsAfter(list, d) -> [e, f]
getElementsAfter(list, f) -> []
getElementsAfter(list, z) -> []
getElementsAfter(null, z) -> throw new IllegalArgumentException()
getElementsA 
*/
public class ArrayExamples<T> {

    public static <T> List<T> getElementsAfter(List<T> list, T element) {
        // iterate over the list
        for(int i = 0; i< list.size(); i++) {
            // if input element is null throw exception
            if(element == null) {
                System.out.println("Input Element is Null");
            } 
            else if(!(list.get(i).equals(element))) {
                System.out.println("Element Not Present in the list");
            }
            else if(list.get(i).equals(element)) {
            	List<T> newList = list.subList(i+1, list.size());
            	System.out.println(newList);
            	return newList;
            }
        }
        return list;
    }

    public static void main(String str[]) {
    	List<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        inputList.add(5);
        inputList.add(6);
        
        getElementsAfter(inputList, 6);
    }

}

