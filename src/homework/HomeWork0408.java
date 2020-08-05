package homework;

import lesson29.GoodMorningArraysDayTwo;

public class HomeWork0408 {
    public static void main(String[] args) {
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{5, 11, 9};
        int[] b3 = new int[]{7, 0, 0};

        int[] mc1 = new int[]{1, 2, 3};
        int[] mc2 = new int[]{4, 5, 6};
        int[] kc1 = new int[]{7, 7, 7};
        int[] kc2 = new int[]{3, 8, 0};
        int[] nc1 = new int[]{5, 2, 9};
        int[] nc2 = new int[]{1, 4, 5};

        GoodMorningArraysDayTwo.myArrayPrint(reverse3(b1));
        GoodMorningArraysDayTwo.myArrayPrint(reverse3(b2));
        GoodMorningArraysDayTwo.myArrayPrint(reverse3(b3));
        GoodMorningArraysDayTwo.myArrayPrint(middleWay(mc1, mc2)); //→ [2, 5]
        GoodMorningArraysDayTwo.myArrayPrint(middleWay(kc1, kc2)); //→ [7, 8]
        GoodMorningArraysDayTwo.myArrayPrint(middleWay(nc1, nc2)); //→ [2, 4]
    }

    public static int[] middleWay(int[] a, int[] b) {

        int[] output = new int[2];
        output[0]=a[1];
        output[1]= b[1];

        return output;
        }

    public static int[] reverse3(int[] b) {
        for (int i = 0; i < b.length; i++) {
        }
        int b4 = b[0];
        b[0] = b[2];
        b[2] = b4;
        return b;
    }
}
