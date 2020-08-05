package lesson10;

public class Rewiev {
    public static void main(String[] args) {
        System.out.println(waysOfVikingOne(0));
        System.out.println(waysOfVikingOne(1));
        System.out.println(waysOfVikingOne(2));
        System.out.println(waysOfTheVikingTwo("Left"));
        System.out.println(waysOfTheVikingTwo("Right"));
    }

    public static String waysOfVikingOne(int way) {
        String result = "";
        if (way == 0) {
            result = "Will lost your horse";
        } else if (way == 1) {
            result = "Will lost your life";
        } else if (way == 2) {
            result = "Will find happynes";
        }
        return result;


    }

    public static String waysOfTheVikingTwo(String way) {
        String result = "";
        switch (way) {
            case "Left":
                result = "Will lost your horse";
                break;
            case "Right":
                result = "Will lost your life";
                break;
            case "Strate":
                result = "Will find happynes";
                break;

            default:
                result = "Make choise againe";
                break;

        }
        return result;


    }
}


