package lesson10;

public class MissingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1)); // "ktten"
        System.out.println(missingChar("kitten", 0)); //  "itten"
        System.out.println(missingChar("kitten", 4)); //"kittn"
        System.out.println(missingChar("Andrew", 2)); // Anrew
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));


    }

    public static String missingChar(String s, int n) {
        String output = "";
        output = s.substring(0, n);
        //+ s.substring(n + 1);

        return output;
    }

    public static String backAround(String str) {
        String output = "";
        int lastSymbol = str.length() - 1;
        output = str.substring(str.length() - 1);
        return output+str+output;



    }
}

