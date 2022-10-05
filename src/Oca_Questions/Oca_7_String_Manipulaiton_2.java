package Oca_Questions;

public class Oca_7_String_Manipulaiton_2 {

    public static void main(String[] args) {

        //Q-1
        String numbers="012345678";
        System.out.println(numbers.substring(1,3));  //
        System.out.println(numbers.substring(7,7)); //
        System.out.println(numbers.substring(7));  //

        //Q-2
        String s="purr";
        s.toUpperCase();
        s.trim();
        s.substring(1,3);
        s+=" two";
        System.out.println(s.length()); //8


    }

}
