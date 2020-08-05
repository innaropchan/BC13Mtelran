package lesson11;

public class Logic01 {
    public static void main(String[] args) {
        //System.out.println(smartDepositBox(true, false)); //-> true
        //System.out.println(smartDepositBox(false, true)); //-> true
        //System.out.println(smartDepositBox(false, false)); //-> false
        //System.out.println("---------------------");
        ////System.out.println(smartDepositBoxTwo(true, false)); //-> false
        //  System.out.println(smartDepositBoxTwo(false, true)); //-> false
        //  System.out.println(smartDepositBoxTwo(false, false)); //-> false
        //  System.out.println(smartDepositBoxTwo(true, true)); //-> true
        // System.out.println("----------");
        System.out.println(bigBadaBoom(true, true)); //-> true
        System.out.println(bigBadaBoom(false, false)); // -> false
        System.out.println(bigBadaBoom(true, false)); // -> false
        System.out.println("--------");
        System.out.println(verySmartDepositBox(true, true, false)); //false
        System.out.println(verySmartDepositBox(false, true, true)); //true
        System.out.println(doorBell(true, true)); //false
        System.out.println(doorBell(false, false)); //-> false
        System.out.println(doorBell(true, false)); // -> true


    }

    public static boolean smartDepositBox(boolean mamaTouch, boolean papaTouch) {

        return mamaTouch || papaTouch;

    }

    public static boolean smartDepositBoxTwo(boolean mamaTouch, boolean papaTouch) {
        return mamaTouch && papaTouch;
    }

    public static boolean bigBadaBoom(boolean captain1, boolean captain2) {
        return captain1 && captain2;
    }

    public static boolean verySmartDepositBox(boolean mamaPermission, boolean papaPermission, boolean omaPermission) {
        return omaPermission || smartDepositBoxTwo(mamaPermission, papaPermission);
    }

    public static boolean doorBell(boolean bell1, boolean bell2) {
        return bell1 ^ bell2;
    }

}
