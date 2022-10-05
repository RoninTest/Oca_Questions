package Oca_Questions;

public class Oca_23_Constructor {


    int count;

    public void Oca_23_Constructor() {  //It is a method because of "void- return type"
        count = 4;
    }
/*
    public Oca_23_Constructor(){ //It is a const because of not having "void- return type"
        count=4;
    }
 */


    public static void main(String[] args) {

        Oca_23_Constructor cns=new Oca_23_Constructor();
        System.out.println(cns.count);  // 0
    }
}
