package homework;
//Даны целые числа A и B, где B > 0. Вывести B раз число A.
//Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.

public class HomeWork2007 {
    public static void main(String[] args) {
        integer2007();
          integer2(5,17);
       // drawAStar(3, 6);


    }


    public static void integer2007() {
        int i = 0;
        int a = 2;
        int b = 10;
        while (i < b) {
            System.out.println(a);
            i++;
        }


    }


    public static void integer2(int a, int b) {
        int i = a;
        while (i < b) {
            System.out.println(i);
            i += 1;
        }
    }


    public static void drawAStar(int a, int b) {
        int i = a;
        String space = "";
        String star = "*";
        space = space + star;

        while (i < b * i + i++) {
            System.out.println(space);

        }

    }

}
