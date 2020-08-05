package lesson06;

public class HelloSwitchCase {
    public static void main(String[] args) {
        int customerOne= 11;
        int customerTwo = 12;
        int customerThree =0;

       coffeeSwitch(customerOne);
       split();

       coffeeSwitch(customerTwo);
       split();

       coffeeSwitch(customerThree);
       split();


    }

    public static void split() {
        System.out.println("------------------");
    }

    public static void coffeeSwitch(int customerValue) {
        String result = "";
        switch (customerValue) {
            case 11:
                 CoffeeRecipes.cappuccino();
                break;
            case 12:
                CoffeeRecipes.latte();
                break;

            default:
                result = "Currently not available";
                break;
        }
        // System.out.println("Программа приготовления кофе отработана без ошибок");

    }
}