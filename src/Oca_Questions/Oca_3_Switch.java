package Oca_Questions;

public class Oca_3_Switch {

    public static void main(String[] args) {

        //What is result ?
        //result is great - good
        final char a='A', d='D'; //final keyword determines as the last assignment
        char grade='B';

        switch (grade){  // if switch() = case ? start : stop
            case a:
            case 'B' :
                System.out.println("great");
            case 'C' :
                System.out.println("good");
                break;
            case d:
            case 'F' :
                System.out.println("not good");
        }
    }



}
