package homework;

public class Homework2107 {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob")); // →true
        System.out.println(bobThere("b9b")); // →true
        System.out.println(bobThere("bac")); // →false
    }
    public static boolean bobThere(String input) {
        char c0 = 'b';
        char c1 = 'b';
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == c0 && input.charAt(i + 2) == c1)
                return true;
        }
        return false;
    }
}
