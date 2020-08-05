package homework;

public class HomeWork0807 {
    public static void main(String[] args) {
        System.out.println(findCostForTheDoor());
    }

    public static double findCostForTheDoor() {
        double doorSquare = 1.8; //  в задаче дано условие 2*90м
        double priceJambCost = 100.0;
        double priceDoor = 120.0;
        double costForTheDoor = doorSquare * (priceJambCost + priceDoor);

        double windowsSquare = 0.6; // может быть взята любая площадь окна
        double priceWindows =+ priceJambCost;
        double windowsCost = windowsSquare * (priceWindows+priceWindows);

        return costForTheDoor + windowsCost;

    }
}


