package Oca_Questions;

import java.util.Arrays;

public class Oca_17_ArrayBinarySearch {
    public static void main(String[] args) {


        int[] random={16,-41,112,10,-110};

        int x=10;
        Arrays.sort(random);
        int y= Arrays.binarySearch(random,x);
        System.out.println(y);


          String[] fruits={

                  "banana",
                  "apple",
                  "pear",
                  "greap"
        };
          Arrays.sort(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]+" ");
        }
        System.out.println(Arrays.binarySearch(fruits,"pear"));




    }
}
