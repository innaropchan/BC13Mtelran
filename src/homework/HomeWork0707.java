package homework;

public class HomeWork0707 {
    public static void main(String[] args) {
        violationOfTheRules(45);
        violationOfTheRules(55);
        violationOfTheRules(70);
        violationOfTheRules(110);
        violationOfTheRules(150);

    }

    public static void violationOfTheRules(int speed) {

        if (speed <= 50) {
            System.out.println("No violations");
        } else if (speed <= 65) {
            System.out.println("Verbal censure and lecture for 5 minutes");
        } else if (speed <= 100) {
            System.out.println("Fine -40 euro");
        } else if (speed <= 130) {
            System.out.println("Fine - 500 euro");
        } else {
            System.out.println("Fine - 1000 euro, confiscation driver's license for 3 years and confiscation of сar ");
        }



    }
}
