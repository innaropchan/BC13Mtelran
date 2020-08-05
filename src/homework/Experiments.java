package homework;

public class Experiments {

    public static void main(String[] args) {
       // System.out.println(loneSum(1, 2, 3));

        //findANumber();
        //oou();


        int i = 0;
        int max = 10; //к-во строк

        while (i < max) {
            String space = "";
            String star = "*";
            for (int j = 0; j < max - i; j++) space += " ";
            for (int j = 0; j < 2 * i + 1; j++) star += "*";
            System.out.println(star);
            i++;

        }
    }


    public static void findANumber() {
        for (int i = 0; i <= 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.print(i);
            }
        }
    }

    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        } else if (b == c) {
            return a;
        } else if (a == c) {
            return b;
        } else if (a == b) {
            return c;
        } else {
            return a + b + c;
        }
    }

    public static void oou() {
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;

        }


    }
    public int[] reverse3(int[] nums) {
        int[] myArray = new int[3];
        myArray[0] = nums[2];
        myArray[1] = nums[1];
        myArray[2] = nums[0];
        return myArray;
    }

}
