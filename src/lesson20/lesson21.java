package lesson20;

public class lesson21 {
    public static void main(String[] args) {
test();
        //System.out.println(cigarParty(30, false)); // → false
//        System.out.println(cigarParty(70, true));// → true
        //  System.out.println(cigarParty(70, false));// → true
        //System.out.println(paris(11, 15)); //-> false
      //  System.out.println(paris(11, 5));  //-> true

    }

    public static boolean paris(int a, int b) {
        return ((a + b) < 25);

    }

    public static void test() {
        int a = 10;
        int b = 20;
        int c;
        c = (a > b) ? a : b;
        System.out.println("" + c);
    }


    private static boolean cigarParty(int n, boolean b) {
        if (n >= 40 && n <= 60) {
            return true;
        } else if (n > 60 && b) {
            return true;
        }
        return false;


    }
}