package lesson12;

public class MyLife {
    public static void main(String[] args) {
        int weekDay = 5;
        int amountWeekDaySergej = 6;
        int amountWeekDayAndrew = 4;
        itsMyLife(amountWeekDaySergej);
        itsMyLife(amountWeekDayAndrew);
    }

    public static void itsMyLife(int amountWeekDay) {
        for (int i = 1; i <= amountWeekDay; i++) {
            System.out.println("--------");
            System.out.println("New Day " + i);
            System.out.println("Wake up at 6 a.m.");
            System.out.println("Go to work to 8 a.m");
            System.out.println("Go back to home");
            System.out.println("Looking TV");
            System.out.println("Go sleep");
            System.out.println("End of the day");
        }
    }
}
