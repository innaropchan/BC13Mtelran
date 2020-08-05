package homework;

public class HomeWork2407 {
    public static void main(String[] args) {
        // enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
        //   System.out.println(nearTen(12)); //→ true
        // System.out.println(nearTen(17)); //→ false
        // System.out.println(nearTen(19)); //→ true
        //System.out.println(teaParty(6, 8)); //→ 1
        //   System.out.println(teaParty(3, 8)); //→ 0
        //  System.out.println(teaParty(20, 6)); // → 2
      //  System.out.println(twoAsOne(1, 2, 3)); // →true
       // System.out.println(twoAsOne(3, 1, 2)); // →true
       // System.out.println(twoAsOne(3, 2, 2)); // →false

        System.out.println(lastDigit(23, 19, 13)); // →true
          System.out.println(lastDigit(23, 19, 12));// →false
        System.out.println(lastDigit(23, 19, 3)); // →true


    }

    public static void enigmaCaesar(String input) {

        String char0 = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String char1 = "Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я А Б В";

    }

    public static boolean nearTen(int num) {
        if (num % 10 <= 2 || num % 10 >= 8) {
            return true;
        }
        return false;
    }

    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;

        } else if ((tea * 2 <= candy) || (candy * 2 <= tea)) {
            return 2;
        }

        return 1;
    }

    public static boolean twoAsOne(int a, int b, int c) {
        return (a + b == c || b + c == a || c + a == b);

    }

    public static boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10);


    }
}
