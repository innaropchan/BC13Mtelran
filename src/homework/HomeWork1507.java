package homework;

public class HomeWork1507 {
    public static void main(String[] args) {
        //  System.out.println(loneSum(1, 2, 3));  //6
        //  System.out.println(loneSum(3, 2, 3));  //2
        //  System.out.println(loneSum(3, 3, 3));  //0
        // System.out.println(minCat("Hello", "Hi")); // → "loHi"
        // System.out.println(minCat("Hello", "java")); // → "ellojava"
        // System.out.println(minCat("java", "Hello"));  // → "javaello"
        doubleChar("The"); //→ "TThhee"
        // doubleChar("AAbb");  //→ "AAAAbbbb"
        //doubleChar ("Hi-There");  // → "HHii--TThheerree"

    }

    public static int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b) sum = 0;
        if (b == c) sum = 0;
        if (a == c) sum = 0;

        return sum;
    }

    public static String minCat(String a, String b) {
        String output = "";
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()) + b;
        } else if (a.length() < b.length()) {
            return a + b.substring(a.length() - b.length());
        }
        {

        }

        return output;
    }

    public static void doubleChar(String a) {
        String name = a;
        int b = 84;
        int c = 104;
        int d = 101;
        String char1 = a + b + c;
        String str1 = String.valueOf(char1);
        System.out.println(str1 +" " +str1 +" " + str1+" " + str1 + str1 + str1);

    }

}



