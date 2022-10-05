package Oca_Questions;

public class Oca_16_Arrays_2 {
    public static void main(String[] args) {


        char[]c=new char[2];
        int length= c.length;
        System.out.println(length);

        //MultiDimensionalArrays

        int arr1[]={1,2,053,4};

        int arr2[][]={{1,2,4},{2,2,1},{0,43,2}};
        System.out.println(arr1[3]==arr2[0][2]);  // true
        System.out.println(" "+(arr1[2]==arr2[2][1])); //false I'am fault // true



    }
}
