package homework;

public class HW0607 {
    public static void main(String[] args) {
        int customerAge0 = 10;
        int customerAge1 = 17;
        int customerAge2 = 18;
        int customerAge3 = 20;
        int customerAge4 = 30;
        String fromCustomerAge = alcohol(customerAge0);
        System.out.println(fromCustomerAge);

        System.out.println(alcohol(customerAge1));

        System.out.println(alcohol(customerAge2));

        System.out.println(alcohol(customerAge3));

        System.out.println(alcohol(customerAge4));



        int monthSeason = 2;
        String monthString = "";


        switch (monthSeason) {
            case 1:
                monthString = "Январь - это зима";
                break;
            case 2:
                monthString = "Февраль  - это зима";
                break;
            case 3:
                monthString = "Март - это весна";
                break;
            case 4:
                monthString = "Апрель - это весна";
                break;
            case 5:
                monthString = "Май - это весна";
                break;
            case 6:
                monthString = "Июнь - это лето";
                break;
            case 7:
                monthString = "Июль - это лето";
                break;
            case 8:
                monthString = "Август - это лето";
                break;
            case 9:
                monthString = "Сентябрь - это осень";
                break;
            case 10:
                monthString = "Октябрь - это осень";
                break;
            case 11:
                monthString = "Ноябрь - это осень";
                break;
            case 12:
                monthString = "Декабрь - это зима";
                break;

            default:
                monthString = "Invalid month -" + monthSeason;
                break;

        }
        System.out.println(monthString);

    }

    public static String alcohol(int customerAge) {
        String result = "";
        switch (customerAge) {
            case 10:
                result = " Not allowed to sell alcohol";
                break;
            case 17:
                result = "Not allowed to sell alcohol";
                break;
            case 18:
                result = "Allowed to sell alcohol";
                break;
            case 20:
                result = " Allowed to sell alcohol";
                break;
            case 30:
                result = "Allowed to  sell alcohol";
                break;

        }
            return result;


        }
    }










