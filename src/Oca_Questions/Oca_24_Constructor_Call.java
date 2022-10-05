package Oca_Questions;

public class Oca_24_Constructor_Call {

    int x=10, y;
    Oca_24_Constructor_Call(){  // nonparametric const-1, no return-type
        System.out.println(x * y);
    }

    Oca_24_Constructor_Call(int x, int y){ //parameter const - 2
        this();  // const call
        this.x=x;
        this.y=10;
        System.out.print(x * y); // yazdırmak istediğimizde ilk önce bu scope bakar eğer bulamazsa instance veriablelara gider.
    }
    Oca_24_Constructor_Call(int x, int y, int z){ //parameter const - 3
        this(y,z);  // const call
        this.x=x;
        this.y=y;
        System.out.print(x * z);
    }

    public static void main(String[] args) {
        Oca_24_Constructor_Call const1=new Oca_24_Constructor_Call(3,4,5);
        System.out.print(const1.x * const1.y);
    }
}
