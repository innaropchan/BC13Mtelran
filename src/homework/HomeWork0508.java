package homework;

import lesson29.GoodMorningArraysDayTwo;

public class HomeWork0508 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] a3 = new int[]{1, 2, 3};
        // GoodMorningArraysDayTwo.myArrayPrint(midThree(a1)); //→ [2, 3, 4]
        // GoodMorningArraysDayTwo.myArrayPrint(midThree(a2)); // → [7, 5, 3]
        //GoodMorningArraysDayTwo.myArrayPrint(midThree(a3)); // → [1, 2, 3]
        int[] b1 = new int[]{1, 3, 4, 5};
        int[] b2 = new int[]{2, 1, 3, 4, 5};
        int[] b3 = new int[]{1, 1, 1};
        // System.out.println(unlucky1(b1)); // →true
        // System.out.println(unlucky1(b2)); //→true
        //System.out.println(unlucky1(b3)); //→false
        int[] c1 = new int[]{1, 2, 3};
        int[] c2 = new int[]{1, 2, 3, 1};
        int[] c3 = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(c1)); // → false
        System.out.println(sameFirstLast(c2)); //→ true
        System.out.println(sameFirstLast(c3)); //true

    }

    public static int[] midThree(int[] input) {
        int[] output = new int[3];
        output[0] = input[input.length / 2 - 1];
        output[1] = input[input.length / 2];
        output[2] = input[input.length / 2 + 1];
        return output;
    }

    public static boolean unlucky1(int[] input) {
        return ((input[0] == 1) && (input[1] == 1)) ^ ((input.length - 1) != 1);

    }

    public static boolean sameFirstLast(int[] input) {

        return input.length >=1 && input[0] == input[input.length - 1];
    }

}





