package Oca_Questions;

public class Oca_12_DoWhileLoop {

    public static void main(String[] args) {

        System.out.println("***Q1***");
        boolean keepGoing = true;
        int result=15 , i=10;
        do{
            i--; //10 - 9
            if(i==8) keepGoing=false;
            result-=2;
        }while(keepGoing);

        System.out.println(result+"\n");


        System.out.println("***Q2***");
        int m=9, n=1, x=0;
        do{
            m--; //8//7//6
            n+=2; //3//5//7
            x+=m+n; //11//23//36
        }while (m>n);
        System.out.println(x);
    }

}
