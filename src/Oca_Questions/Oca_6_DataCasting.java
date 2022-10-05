package Oca_Questions;

public class Oca_6_DataCasting {
    public static void main(String[] args) {

        long x=10;
        int y=2*(int)x;
        //int y=2*(int)x;

        int sayi1=65;
        short sayi2=(short) sayi1;

        sayi1=129;
        byte sayi=(byte)sayi1;
        System.out.println(sayi);


        byte a=40, b=50;
        byte sum=(byte)(a+b); //önce yoplar sonra cast eder. (byte)a+(byte)b --> int olarak algılar.
        System.out.println(sum);
    }
}
