package homework;

public class Homework1208 {
    public static void main(String[] args) {
        int[] a1 = new int[]{2, 1, 2, 3, 4};
        int[] a2 = new int[]{2, 2, 0};
        int[] a3 = new int[]{1, 3, 5};
        System.out.println(countEvens(a1)); // → 3
        System.out.println(countEvens(a2)); // → 3
        System.out.println(countEvens(a3));  // → 0


        int[] b1 = new int[]{1, 2, 1, 1, 3};
        int[] b2 = new int[]{1, 4, 2, 1, 4, 1, 4};
        int[] b3 = new int[]{1, 4, 2, 1, 4, 1, 4};
        System.out.println(maxSpan(a1)); // →4
        System.out.println(maxSpan(a2));  // →6
        System.out.println(maxSpan(a3));  // →6

    }
    private static int[] maxSpan(int[] input) {
int spanLast=0;
int spanFirst=0;
int find= 0;
int find2= 0;
        for (int i = 0; i <input.length; i++) {
            if (input[i]==input[input.length-1]){
                find++;
                if (find==1){
                    spanLast=input.length-i;
                }
            }

        }


        return input;
    }

    public static int countEvens(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

