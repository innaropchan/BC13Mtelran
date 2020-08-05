package lesson19;

public class Tabelle02 {
    public static void main(String[] args) {
        //multiplicationTable(3);
        // printLeapYear(2000, 2009);
        printDivisors(6);
    }

    public static void multiplicationTable(int digit) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result = "" + digit + "*" + i + "=" + digit * i;
            System.out.println(result);
        }
    }

    public static void printLeapYear(int yearOne, int yearTwo) {
        for (int i = yearOne; i < yearTwo; i++) {
            System.out.println(i);

        }
    }

    public static void printDivisors(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println("total divisors: " + count);
    }
}
