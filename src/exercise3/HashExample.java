// Hash tables offers fast insertion and searching
// Hash tables are hard to order
// Hash function calculates the index an item should go in
// Map implementations - HashMap, HashTable, TreeHashMap, LinkedHashMap
package exercise3;
import java.util.HashMap;

public class HashExample {
    public static void main(String str[]) {
        HashMap<String, String> obj = new HashMap<String, String>();
        obj.put("A", "pwdA");
        obj.put("B", "pwdB");
        obj.put("C", "pwdC");
        obj.put("D", "pwdD");

        obj.forEach((k,v)->System.out.println(k+" : "+v));
    }
    
    


}