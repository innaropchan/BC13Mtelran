package homework;

public class HomeWork2707<b> {
    public static void main(String[] args) {
        //System.out.println(blueTicket(9, 1, 0)); //→ 10
        //System.out.println(blueTicket(9, 2, 0)); // → 0
        //System.out.println(blueTicket(6, 1, 4)); // → 10
        System.out.println(blueTicket(17, 13, 7)); //5
        //  System.out.println(dateFashion(5, 10)); //  →2
        // System.out.println(dateFashion(5, 2)); // →0
        // System.out.println(dateFashion(5, 5)); //→1
        // System.out.println(sortaSum(3, 4)); // → 7
        //System.out.println(sortaSum(9, 4)); // → 20
        //System.out.println(sortaSum(10, 11)); // → 21


    }

    public static int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || c + a == 10) {
            return 10;
        } else if ((a + b) -(b + c)== 10 || (a + b) - (c + a) == 10) {   //не работает :(
            return 5;
        }
        return 0;
    }

    public static int dateFashion(int me, int date) {
        if (me >= 8 || date >= 8) {
            return 2;
        } else if (me <= 2 || date <= 2) {
            return 0;
        }
        return 1;
    }

    public static int sortaSum(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 19) {
            return 20;
        }
        return result;
    }
}