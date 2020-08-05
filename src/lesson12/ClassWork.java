package lesson12;

public class ClassWork {
    public static void main(String[] args) {
        //classWork01();
      //  classWork02(10, 5);
        classWork03(5,7);

    }

    public static void classWork01() {
        for (int i = 0; i < 20; i *= 2) {
            System.out.println(i);

        }
    }

    public static void classWork02(int a, int b) {
        for (int i = 0; i <b; i++) {
            System.out.println(a);
        }
    }
    public static void classWork03(int a, int b){
        for (int i = a; i <=b; i++) {
            System.out.println(i);
        }

    }
}
