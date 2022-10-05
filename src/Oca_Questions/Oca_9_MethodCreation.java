package Oca_Questions;

public class Oca_9_MethodCreation {


        public static long square(int x) {
            long y = x * (long) x;
            x = -1;
            return y;
        }
        public static void main(String[] args) { //Entry Point
            int value=9;
            long result=square(value); //method call
            System.out.println(value +" "+result);
        }
    }

