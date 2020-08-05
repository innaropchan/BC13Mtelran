package lesson22;

public class StringClassWork {
    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx")); // → true
        System.out.println(gHappy("xxgxx"));  //;→ false
        System.out.println(gHappy("xxggyygxx"));  //; → false

    }

    public static int gHappy(String s) {
        int wordsNumber = 0;
        for (int i = 1; i < s.length(); i++) {
            //if (s.charAt(i) == ' ' && (s.charAt(i - 1) == 'y' || s.charAt(i - 1) == 'z')) {
            char tempChar = s.charAt(i);
            if (!Character.isLetter(tempChar) && (s.charAt(i - 1) == 'y' || s.charAt(i - 1) == 'z')) {
                wordsNumber++;
            }
        }
        if (s.endsWith("y") || s.endsWith("z")) {
            wordsNumber++;
        }
        return wordsNumber;

    }

}
