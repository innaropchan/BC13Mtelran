package lesson16;

public class String01 {
    public static void main(String[] args) {
        System.out.println(helloName("Bob")); // → "Hello Bob!"
        System.out.println(helloName("Alice")); //→ "Hello Alice!"
        System.out.println(helloName("X"));  // → "Hello X!"
    //    makeOutWord("<<>>", "Yay") → "<<Yay>>"
     //   makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
       // makeOutWord("[[]]", "word") → "[[word]]"
        //System.out.println(nonStart("Hello", "There")); // → "ellohere"
        //System.out.println(nonStart("java", "code"));
       // System.out.println(nonStart("shotl", "java")); //         System.out.println(nonStart("shotl", "java")); //
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));


    }

    public static String helloName(String name) {

        String hello = "Hello";
        char symbol;
        symbol = '"';
        return symbol+ hello.concat(" " + name + "!" + symbol);
    }
 //   public static String makeOutWord (String symbol, String word){
   //     symbol= symbol.substring(0, symbol.length()/2);

      //  return" result";

    public static String nonStart (String a, String b){

        return a.substring(1) +b.substring(1);
    }

    public static String theEnd (String s, boolean front){
    if (front){
        return s.substring(0,1);
    }else

        return s.substring(s.length() -1);
    }


}
