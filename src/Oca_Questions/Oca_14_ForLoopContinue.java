package Oca_Questions;

public class Oca_14_ForLoopContinue {
    public static void main(String[] args) {

        int count=0;
        ROW_LOOP:for (int row = 1; row <=3 ; row++)  //outer loop
            for (int col = 0; col <=2 ; col++) {  //inner loop
                if (row * col %2==0)continue ROW_LOOP; // if It is true then ROW_LOPP works.
                count++;
            }  //inner loop end outer loop end
        System.out.println(count);



    }
}
