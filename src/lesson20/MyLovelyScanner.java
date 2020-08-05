package lesson20;

import java.util.Scanner;

public class MyLovelyScanner {
    public static void main(String[] args) {
        // System.out.print("Hello world");
        //   System.out.printf("");

        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("How old are you");
        age = input.nextInt();
        if (age >= 18) {
            System.out.println("Allowed to sell alcohol");
        } else {
            System.out.println("Go to mummy");
        }

    }
}
