package lesson13;

public class Geometry {
    public static void main(String[] args) {
        first("*", 10);
    }
    public static void first(String divider, int countLines){
        String line ="";
        for (int i = 0; i <countLines; i++) {
            line= line + divider;
            System.out.println(line);

        }

    }
}
