package Oca_Questions;

public class Oca_21_WhileMethod {

    public static void addToInt(int x,int amountToAdd){
        x+=amountToAdd;  //There is no return or a writing method.
    }
    public static void main(String[] args) {

        boolean keepGoing=true;
        int count=0;
        int x=3;
        int sayac=1;

        while(count++ < 3){
            int y=(1 + 2 * count) % 3;
            switch (y){
                default :
                case 0: x+=1;break;
                case 1: x +=5;
            }
        }

        System.out.println(x);


        //Q2
        int a=15;
        int b=10;
        Oca_21_WhileMethod.addToInt(a,b);
        System.out.println(a); //15


    }
}
