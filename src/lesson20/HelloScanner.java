package lesson20;

import java.util.Scanner;

public class HelloScanner {
    public static void main(String[] args) {
        helloUser();
    }

    private static void helloUser() {
        String name = "", surname = "", gender = "", email = "";
        int age = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("How is your name?");
        name=userInput.next();
        System.out.println("How is your surname?");
        surname=userInput.next();
        System.out.println(" Your gender?");
        gender=userInput.next();
        System.out.println(" Your email?");
        email=userInput.next();
        System.out.println("How old are you?");
        age=userInput.nextInt();

        System.out.println("Welcome to our website " + name);
        System.out.println( "Check your data's " + surname+" "+gender+" "+email+" "+age);
    }


}
