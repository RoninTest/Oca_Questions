package Oca_Questions;

import java.util.Locale;

public class Oca_4_StringManipulations {
    public static void main(String[] args) {
        String str1= "Java";
        String str2=new String("java"); //bunun referansı farklı.
        //String'te  == kullanılmaması tercih edilir. Bunun yerine equals methodu kullanmak faydalı olur.
        //Equals methodu sadece String'lerin içeriğine bakarken, aşağıdaki şık doğru olacaktır.
        // == hem içeriğe hem'de referansa bakar.   str1.toLowerCase()==str2.toLowerCase(); ama bunda referansa da bakacak orada new lendiği için patlar.

        if (str2.equals(str1.toLowerCase())) {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equeal");
        }



    }
}
