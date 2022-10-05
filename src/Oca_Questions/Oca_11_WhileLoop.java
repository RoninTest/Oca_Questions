package Oca_Questions;

public class Oca_11_WhileLoop {
    public static void main(String[] args) {

        //Q1
        int x=0;
        while(x++<10){ } //postincrement
        String message=x>10 ? "Greather than :" : "false";
        System.out.println(message+","+x);

        //Q2
        int a=1, b=15;
        while (a<10); //endless
            b--;
            a++;
        System.out.println(a+", "+b);

    }
}
