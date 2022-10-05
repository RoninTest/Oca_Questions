package Oca_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Oca_19_Lists_2 {

    //Q1
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10, 4, -1, 5);

        Collections.sort(list); //sort transaction
        Integer array[]=list.toArray(new Integer[4]);
        System.out.print(array[0]+"\n"); // -1


        //Q2

        String [] names={"Tom","Dick","Harry"};
         List<String> list1=Arrays.asList(names); // List<String> list1=names.asList(); --> false descrption
            list1.set(0,"Sue");
            System.out.println(names[0]);
    }
}
