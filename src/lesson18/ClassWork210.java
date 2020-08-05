package lesson18;

public class ClassWork210 {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("А роза упала на лапу Азора"));
        System.out.println(checkPalindrom("поп"));
        System.out.println(checkPalindrom("школа"));
        //System.out.println(deleteSpace("А роза упала на лапу Азора"));

    }

    public static boolean checkPalindrom(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = input.charAt(i) + output;
        }
        input = deleteSpace(input).toLowerCase();
        output = deleteSpace(output).toLowerCase();
        // System.out.println(input);
        return input.equals(output);
    }

    public static String deleteSpace(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                //   if(!(input.substring(i, i+1).equals(" "))){
                output = output + input.charAt(i);


            }

        }
        //System.out.println(output);
        return output;
    }

}
