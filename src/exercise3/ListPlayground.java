package exercise3;

import java.util.*;

public class ListPlayground {

    public static void main(String str[]) {

        // define ArrayList
        ArrayList<String> ls = new ArrayList<String>();
        for(int i=0; i<8; i++) {
            ls.add("sm"+i);
        }
        System.out.println(ls);

        // define LinkedList
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("Hello");
        obj.add("World");
        obj.add("!");
        
        System.out.println(obj);
        obj.remove(2);

        System.out.println("post removal -----" +obj);

        // define list with duplicates

        List<Integer> duplicateList = new LinkedList<Integer>();
        duplicateList.add(1);
        duplicateList.add(2);
        duplicateList.add(2);
        duplicateList.add(3);
        duplicateList.add(3);
        System.out.println(findDuplicates(duplicateList));
    }

    // find all duplicates
     static Set<Integer> findDuplicates(List<Integer> list) {
         Set<Integer> finalList = new HashSet<Integer>();
         Set<Integer> s = new HashSet<Integer>();

         for(Integer i : list) {
             if(!s.add(i)) {
                 finalList.add(i);
             }
         }   
         return finalList;
     }
}