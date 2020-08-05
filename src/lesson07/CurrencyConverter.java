package lesson07;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println(findCurrencyCourse("EUR"));
    }



    public static double findCurrencyCourse(String currencyName) {

        double currencyCourse = 0.0;
        switch (currencyName) {
            case "EUR":
                currencyCourse = 1.12;
                break;
            case "RUB":
                currencyCourse = 0.014;
                break;
            case "USD":
                currencyCourse =1.0;
                break;
            case "GPB":
                currencyCourse=1.25;
                break;
            default:
                currencyCourse = 0.0;
                break;

        }
        return currencyCourse;
    }
}
