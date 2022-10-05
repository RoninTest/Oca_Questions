package Oca_Questions;

import java.util.Arrays;

public class Oca_27_PassByValue {
    public static void main(String[] args) {
        String str="Java";
        int arr[]={1,2,3};

        method1(str);
        method2(arr);
        System.out.println(Arrays.toString(arr));  //1,4,3
        method3(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(str);  //Java -Scope

    }

    private static void method3(int[] arr) {
        int newArr[]={10,11,12,13};
        arr=newArr; // new obje point --> [10,11,12,13] it remains this local
    }

    private static void method2(int[] arr) {
        arr[1]=4;
        arr[2]=3;
    }

    private static void method1(String str) {
        str=str.toUpperCase();
    }


}
