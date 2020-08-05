package lesson20;

import java.util.Scanner;

public class FindNumberInGame {
    public static void main(String[] args) {
       // findNumber(100);

    }

    public static void findNumber(int n) {
        int userNumber = 0;
        int number = (int) (Math.random() * ((n - 1) + 1));
        System.out.println(number);
        for (int i = 1; i <= 3; i++) {
            Scanner userInput = new Scanner(System.in);
            System.out.println(i + " Attempts");
            number = userInput.nextInt();
            if (number > userNumber) {
                System.out.println("You are wrong. The number is higher");
            } else if (number < userNumber) {
                System.out.println("You are wrong. The number is lower");
            } else
                System.out.println(" You are right! Super");
        }
        System.out.println("Attempts is over");
    }

    public static void game(){
        int k =0;
        System.out.println("Kakoj yroven slozhnosti Vi xotite?\n" +" Legkij (1)? Ili dlj vzroslix (2)? VVedite 1 ili 2");
        Scanner input = new Scanner(System.in);
        int userGameK= input.nextInt();
        if(userGameK ==1){
            k =10;
        }else k = 5;
    }
}
