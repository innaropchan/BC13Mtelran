package homework;

public class Homework3007 {
    public static void main(String[] args) {
        //System.out.println(starOut("ab*cd"));// →"ad"
        // System.out.println(starOut("ab**cd"));// →"ad"
        // System.out.println(starOut("sm*eilly"));// →"silly"
        System.out.println(countHi("abc hi ho")); // →1
        System.out.println(countHi("ABChi hi")); // →2
        System.out.println(countHi("hihi")); // →2

    }

    /* Возвращает версию заданной строки, в которой для каждой звезды () в строке звезда и символы сразу
   уходят влево и вправо.
   Таким образом, "abcd" дает "ad", а "ab**cd" также дает "ad".*/
    private static String starOut(String input) {
        String output = "";

        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) == '*') {
                // output = output + input.charAt(i - 1) + input.charAt(i) + input.charAt(i + 1);
                output = input.substring(0, (i - 1));
            }
        }
        // input == input.substring() - output;
        return output;

    }

    public static int countHi(String s) {
       String hi= "hi";
        int count =0;
        for (int i = 0; i < s.length()-1 ; i++) {
            if (s.substring(i, i + 2).equals("hi")) ;
            count++;
        }
        return count;
    }

}
