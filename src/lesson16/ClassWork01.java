package lesson16;

public class ClassWork01 {
    public static void main(String[] args) {
        // System.out.println(endsLy("oddly")); //→ true
        //   System.out.println(endsLy("y")); // → false
        //   System.out.println(endsLy("oddy")); // → false

        //System.out.println(lastChars("last", "chars")); //→ "ls"
        // System.out.println(lastChars("yo", "java")); // → "ya"
        // System.out.println(lastChars("hi", "")); // → "h@"

      //  System.out.println(seeColor("redxx")); //"red"
     //   System.out.println(seeColor("xxred")); // → ""
        //System.out.println(seeColor("blueTimes")); // → "blue"
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));


    }

    public static boolean endsLy(String srt) {

        return srt.endsWith("ly");
    }


    public static String lastChars(String a, String b) {
        if (a.length() < 1) {
            a = "@";
        } else if (b.length() < 1) {

            b = "@";
        }

        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public static String seeColor(String s) {
        String red = "red";
        String blue = "blue";
        if (s.substring(0, 3).equals(red)) {
            return red;
        } else if (s.substring(0, 4).equals(blue)) {
            return blue;

        }
        return "";


    }

    public static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String newString = str.substring(0, 2);
            return newString + newString + newString;
        }

    }

}
