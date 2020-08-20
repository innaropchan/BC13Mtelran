package lesson38;

import java.util.Arrays;

public class CombSort {
    public static void main(String[] args) {
        int[] array = createArray(20);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(comb(array)));
    }

    public static int[] comb(int[] array) {
        double stepOne = 1.24733095;
        int step = array.length;
        while (step > 1) {
            step = (int) (step / stepOne);
            System.out.println(step);
            for (int i = 0; step + i < array.length; i++) {
                if (array[i] > array[i + step]) ;
                swap(array, i, i + step);
            }
        }
        return array;
    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static int[] createArray(int length) {
        int[] output = new int[length];
        for (int i = 0; i < length; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}

