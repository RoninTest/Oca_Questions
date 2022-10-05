package Oca_Questions;

public class Oca_28_ImmutableClasses {

    public static void main(String[] args) {
        String s="Hello";
        String t=new String(s);
        if ("Hello".equals(s)) System.out.println("one"); //true
        if (t==s) System.out.println("two");             // false
        if (t.equals(s)) System.out.println("three");   //just It focuses on value.
        if ("Hello"==s) System.out.println("four");
        if ("Hello"==t) System.out.println("five");
    }

}
