package Oca_Questions;

            public class Oca_25_StaticKeyword {
                public  static int length=0; //
            }

            class ConsLength{
                static Oca_25_StaticKeyword cons1=new Oca_25_StaticKeyword();  // 1.step
                static Oca_25_StaticKeyword cons2=new Oca_25_StaticKeyword();  // 2.step
                static {                                                       // 3.step
                    System.out.println(cons1.length);                           // 4.step
                }                                                               // 5.step  length = 0  ***

                public static void main(String[] args) {                        // 6.step
                    cons1.length=2;                                              // 7.step length = 2
                    cons2.length=8;                                              // 8.step length = 8

                    System.out.println(cons1.length);                           // 9.step length = 8   ***
                }
            }
