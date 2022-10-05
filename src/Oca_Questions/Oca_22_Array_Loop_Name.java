package Oca_Questions;

import java.util.ArrayList;
import java.util.List;

public class Oca_22_Array_Loop_Name {
    public static void main(String[] args) {

        //Q-1

        int[] array={6,9,8};
        List<Integer> list=new ArrayList<>();
        list.add(array[0]);  // list {6}
        list.add(array[2]); // list {6,8}
        list.set(1,array[1]); // list {6,9}
        list.remove(0); // list{9}
        System.out.println(list); // [9]



        //Q-2
        int x=5, j=0;
        OUTER : for (int i = 0; i < 3; ) {
            INNER : do {
                i++; x++;
                if (x>10) break INNER;
                x +=4;
                j++;
            }while(j <=2);
            System.out.println(x);
        }

    }
}
