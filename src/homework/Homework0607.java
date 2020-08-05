package homework;

public class Homework0607 {
    public static void main(String[] args) {
        System.out.println("Allowed to sell alcohol " + checkAgeForAlcohol(10));
        System.out.println("Allowed to sell alcohol " + checkAgeForAlcohol(17));
        System.out.println("Allowed to sell alcohol " + checkAgeForAlcohol(18));
        System.out.println("Allowed to sell alcohol " + checkAgeForAlcohol(20));
        System.out.println("Allowed to sell alcohol " + checkAgeForAlcohol(30));

    }


    public static boolean checkAgeForAlcohol(int age) {

        boolean result = false;
        if (age >= 18) {

            result = true;

        } else {
            result = false;
        }
        return result;
    }


}
