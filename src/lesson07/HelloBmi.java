package lesson07;

public class HelloBmi {
    public static void main(String[] args) {
        double height = 176.0;
        double weight = 100.00;
        System.out.println(findBmi(height, weight));

    }

    public static double findBmi(double height, double weight) {
        height /= 100;
        return weight / (height * height);


    }


}
