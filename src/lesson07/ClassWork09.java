package lesson07;

public class ClassWork09 {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(getPercent(1000.0, 7.0));
        System.out.println(findElectricityPrice(50));
    }

    public static boolean nearHundred(int digit) {
        int range = 10;
        // if diffirense 100 and digit < range
        return Math.abs(digit - 100) <= 10 || Math.abs(digit - 200) <= 10;
    }

    public static double getPercent(double amount, double interest) {


        return amount / 100 * interest;
    }

    public static double findElectricityPrice(double kwh) {

        double basicKwhPrice = 0.2;
        double basicPrice = 30.0;
        double basicKwh = 100.0;
        double resultPrice;
        if (kwh > 100) {
            kwh = kwh - basicKwh;
            resultPrice = kwh * basicKwhPrice + basicPrice;
        } else {
            resultPrice = basicPrice;

        }

        return resultPrice;
    }
}

