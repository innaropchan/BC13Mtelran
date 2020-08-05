package lesson06;

public class CoffeeRecipes {

    public static void latte () {
        System.out.println("----------");
        System.out.println("Your drink is ready");
        milk(40);
        coffee(40);
        water(20);
        System.out.println("----------");
    }

    public static void cappuccino(){
        System.out.println("---------");
        System.out.println("Your drink is ready");
        milk(30);
        coffee(40);
        water(20);
        System.out.println("---------");
    }




    public static void milk (int ml) {
        System.out.printf("Added %d ml of milk \n", ml);
    }

    public static void water (int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }

    public static void coffee (int ml) {
        System.out.printf("Added %d ml of coffee \n", ml);


        }

}
