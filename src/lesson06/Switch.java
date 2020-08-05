package lesson06;

public class Switch {
    public static void main(String[] args) {
        int monthDigit = 8;
        String monthString = "";

        switch (monthDigit) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;

            default:
                monthString = "Invalid month -" + monthDigit;
                break;

        }
        System.out.println(monthString);
    }
}
