package lesson13;

public class ClassWork {
    public static void main(String[] args) {
        //rectangle(7, 5);
        floydsTriangle(10);
        // johnDo();
        //multiplicationTable();
    }

  /*  public static void rectangle(int a, int b) {
        String star = "*";
        String line = "";
        for (int i = 0; i < a; i++) {
            line = line + star;

        }

        for (int i = 0; i < b; i++) {
            System.out.println(line);
        }
    */

    public static void floydsTriangle(int n) {
        int number = 1;

        for (int i = 1; i < n; i++) {

            for (int j = 1; j < i; j++) {

                System.out.print(number + "");
                number = number + 1;

            }
            System.out.println(" ");
        }


    }

    public static void johnDo() {
        int rowIndex = 1;
        // xyz = 36
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y <= 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println(rowIndex + ") " + "x = " + x + ", y = " + y + ", z = " + z);
                        rowIndex++;
                    }
                }

            }

        }

    }

    public static void multiplicationTable() {

        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.printf("%5d", i * j );
            }
            System.out.println();
        }
    }
}