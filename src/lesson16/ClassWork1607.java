package lesson16;

public class ClassWork1607 {
    public static void main(String[] args) {
      //  review1();
       // review2();
        System.out.println(genPassword(20));
    }

    public static void review1() {
        String number = "101";
        int result = Integer.parseInt(number);
        System.out.println("Result  = " + result);
    }
  public static void review2 (){
        double pi = 3.14;
        String myPI=String.valueOf(pi);
        double newDigit = Double.parseDouble(myPI);
      System.out.println("Result string to double = " +newDigit);


  }
  public static String genPassword (int length){
        String pass ="";
      for (int i = 0; i <length ; i++) {
          pass = pass + genChar();

      }


        return pass;

  }

    private static char genChar() {
        int myRandom = (int) (Math.random()*((90-65) +1)+65);

        return (char) myRandom;
    }

}

