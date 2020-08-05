package lesson17;

public class String0102 {
    public static void main(String[] args) {
        //System.out.println(left2("Hello"));
        //System.out.println(left2("Java"));
        //System.out.println(left2("Hi"));
        // System.out.println(withoutEnd2("Hello"));
        //  System.out.println(withoutEnd2("abc"));
        // System.out.println(withoutEnd2("ab"));
        //System.out.println(nTwice("Hello", 2));
        //System.out.println(nTwice("Chocolate", 3));
        //System.out.println(nTwice("Chocolate", 1));
        System.out.println(countCode("aaacodebbb")); //→ 1
        System.out.println(countCode("codexxcode")); //→ 2
        System.out.println(countCode("cozexxcope")); //→ 2

    }

    public static String left2(String str)
    {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public static String withoutEnd2(String str)
    {
        return str.substring(1, str.length() - 1);
    }

    public static String nTwice(String s, int n) {

        return s.substring(0, n) + s.substring(s.length() - n);
    }

    public static int countCode(String input) {
        String benchmark = "code";
        char c0 = 'c';
        char c1 = 'o';
        char c3 = 'e';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) == c0 && input.charAt(i + 1) == c1 && input.charAt(i + 3) == c3) {
            count++;
        }
    }
        return count;

}

}
