package homework;

public class HomeWork1307 {

    public static void main(String[] args) {
        paintFigure(10);
    }
    public static void paintFigure (int line){
        String star ="*";
        String space= "         ";
        for (int i = 0; i < line; i++) {
            space = space + star;
            space = space.substring(1, space.length()-1);
            System.out.println(space += star);
        }
    }

   /* public static void paintFigure(int line) {
        String space = " ";
        String output2 = "";
        String star = "*";
        String output = "";
        for (int i = 0; i < line; i++) {
            output = output + star;
            output2 = output2 + space;
            // System.out.println(output += star);

        }
        String empty = "";
        for (int i = 0; i < line; i++) {
            empty = output.substring(0, line);

        }
        String finalVariable = "";
        for (int i = 1; i < line; i++) {
            finalVariable = output.substring(0, output.length() - i) + output2.substring(output.length() - i);
            System.out.println(finalVariable);
      */  }




