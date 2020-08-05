package homework;

public class HomeWork0308 {
    public static void main(String[] args) {
        //findNod(25, 30);
        writeChar();
    }

    /*public static void findNod(int a, int b) {
        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                i++;
            }

            System.out.println(i);
*/



    public static void writeChar() {
        int[] symbol = new int[7];
        char[] charArray = new char[3];
        symbol[0] = '+';
        symbol[1] = '§';
        symbol[2] = '$';
        symbol[3] = '?';

        System.out.println(symbol[1]);
    }
}

