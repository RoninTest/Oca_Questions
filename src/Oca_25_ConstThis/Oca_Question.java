package Oca_25_ConstThis;

public class Oca_Question {
    int num;
    public Oca_Question(int num){ //parameter const
        this.num=num;
    }

    public static void main(String[] args) {
        System.out.println(new Oca_Question(50).num);
    }
}
