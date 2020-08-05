package lesson11;

public class Work11 {
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks")); //true
        System.out.println(mixStart("pix snacks")); ////true
        System.out.println(mixStart("piz snacks")); // false
        System.out.println("------");
        System.out.println(monkeyTrouble(true, true)); //→ true
        System.out.println(monkeyTrouble(false, false)); //→ true
        System.out.println(monkeyTrouble(true, false)); //→ false

    }
    public static boolean mixStart (String str){
String etalon = "ix";
        return str.substring(1,3).equals((etalon));
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){

        return aSmile == bSmile;
    }
}
