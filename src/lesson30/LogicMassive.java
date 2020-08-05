package lesson30;

public class LogicMassive {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 3};
        int[] a3 = new int[]{7, 3, 2};
        int[] a4 = new int[]{1, 3};
        System.out.println(commonEnd(a1, a2)); // →true
        System.out.println(commonEnd(a1,a3)); // →false
        System.out.println(commonEnd(a1,a4)); // →true

    }

    public static boolean commonEnd(int[] a, int[] b){
        return  (a[0]==b[0] ||a[a.length-1]== b[b.length-1]);


    }

}

