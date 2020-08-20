package lesson35;

public class GameMiner {
    public static void main(String[] args) {
        game();
    }

    private static void game() {
        boolean[][] myField = createField(10);
        myPrint(myField);
        countBomb(myField);
    }

    private static void countBomb(boolean[][] myField) {
        int count = 0;
        for (int i = 0; i < myField.length; i++) {
            for (int j = 0; j < myField[i].length; j++) {
                if (myField[i][j]) {
                    count++;
                }
            }
        }
        System.out.println("Quantity of bombs " + count);
    }

    private static void myPrint(boolean[][] myField) {
        for (int i = 0; i < myField.length; i++) {
            for (int j = 0; j < myField[i].length; j++) {
                System.out.print(myField[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean[][] placeBombs(boolean[][] myField) {
        int bombCount = myField.length * myField.length / 10;
        for (int i = 0; i < myField.length; i++) {
            int random1 = myMathrandom(myField.length);
            int random2 = myMathrandom(myField.length);
            myField[random1][random2] = true;
            while (!myField[random1][random2]) {
                random1 = myMathrandom(myField.length);
                random2 = myMathrandom(myField.length);
                myField[random1][random2] = true;
            }
        }
        return myField;
    }

    private static int myMathrandom(int length) {
        return (int) (Math.random() * length);
    }

    private static boolean[][] createField(int length) {
        boolean[][] output = new boolean[length][length];
        output = placeBombs(output);
        return output;
    }

}
