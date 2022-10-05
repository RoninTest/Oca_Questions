package Oca_Questions;

public class Oca_20_Loop_Scope {

    private static int $;
    public static String a_b;

    public static void main(String[] args) {


        //Q1
        int sayi=0;
        int sum=0;

        for (sayi=3 ;sayi>1 ;  sayi/=sayi++) { // 3
            sum+=sayi;

            System.out.println(sum);
        }

        //Q2

        //String a_b; // This code doesn't work because of variable is describe in main and there is no assignment.
        System.out.println($); // int = 0
        System.out.println(a_b); // String = null
        System.out.println();
    }
}
