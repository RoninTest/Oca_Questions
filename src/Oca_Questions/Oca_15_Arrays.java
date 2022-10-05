package Oca_Questions;

import java.util.Arrays;

public class Oca_15_Arrays {
    public static void main(String[] args) {


        int[][] scores=new int[5][10];
        System.out.println(Arrays.deepToString(scores));
        Object[][][] cubbies=new Object[3][0][5];
        System.out.println(Arrays.deepToString(cubbies));

        /*
        String beans[]=new beans[6];  // There isn't datatype
         int[][] types=new int[];  // It should includes 2 layer right side int[][] types=new int[2][];
          int[][] java=new int[][]; // It should includes length int[][] java=new int[5][]
         */

        int arr[]={1,2,3,4};
        System.out.println(arr instanceof Object); //Is Array an Object ?




    }
}
