package lesson34;

import java.util.Arrays;

public class ClassWorkArray0708 {
    public static void main(String[] args) {
        int[] a1 = new int[]{4, 5, 6};
        int[] a2 = new int[]{1, 2};
        int[] a3 = new int[]{3};
        System.out.println(Arrays.toString(makeLast(a1))); /// → [0, 0, 0, 0, 0, 6]
        System.out.println(Arrays.toString(makeLast(a2))); /// → [0, 0, 0, 2]
        System.out.println(Arrays.toString(makeLast(a3))); /// → [0, 3]
    }

    public static int[] makeLast(int[] array) {
        int[] output = new int[array.length * 2];
        output[output.length - 1] = array[array.length - 1];
        return output;
    }
}
