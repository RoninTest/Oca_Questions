package Oca_Questions;

public class Oca_30_Varargs {

        void m1 (int a,int ... b){
            System.out.println(b.length);
    }
        void m1(char c, int... d){
        System.out.println(d[0]);
    }

    public static void main(String[] args) {
        Oca_30_Varargs vrg=new Oca_30_Varargs();
        vrg.m1('b',4,5,6,7);
    }
}
