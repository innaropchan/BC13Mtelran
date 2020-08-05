package lesson10;

public class Exercises01 {
    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));


    }

    public static int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {


            return Math.abs(n - 21);
        }
    }

}
