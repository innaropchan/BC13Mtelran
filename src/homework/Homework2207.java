package homework;

public class Homework2207 {
    public static void main(String[] args) {
        System.out.println(cityWeather("Berlin"));
       // multiplicationTable("Berlin");
    }

    public static String cityWeather(String city) {

        int weekDay = 7;
        String degree = "";
        switch (weekDay) {
            case 1:
                degree = "21";
                break;
            case 2:
                degree = "22";
                break;
            case 3:
                degree = "23";
                break;
            case 4:
                degree = "24";
                break;
            case 5:
                degree = "25";
                break;
            case 6:
                degree = "26";
                break;
            case 7:
                degree = "27";
                break;

        }
       return city + " "+ degree;


    }

    public static void multiplicationTable(String city) {
        int count = 20;
        int max = 27;
        for (int i = 20; i < max; i++) {
          count++;

        }
        System.out.println( city + " " +count);
    }


}




