package exercise3;


public class Vowels {

    public static void main(String str[]) {
        disemvowel("Unrest");
    }

    public static void disemvowel(String str) {
        String replacment = str.replaceAll("[AEIOUaeiou]","" );
        System.out.println(replacment);
    }
}