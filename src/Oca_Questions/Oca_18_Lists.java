package Oca_Questions;

import java.util.ArrayList;
import java.util.List;

public class Oca_18_Lists {
    public static void main(String[] args) {

        //Q-1
        List<String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
        //list.add(7);

        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i)); // The code doesn't work because of 13.line.


        //Q-2
        ArrayList<Integer> values=new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i)); //6
        }


    }
}
