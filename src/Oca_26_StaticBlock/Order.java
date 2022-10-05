package Oca_26_StaticBlock;

public class Order {

    String m="m";  // Instance Veriable
    static String value="t"; //static veriable
    static {value+="a";}  //  static block
        {value+="c";}     //  non static block

        public Order(){ //Const1
        m="h";
        value+="b";
        }

        public Order(String s){ //Const2
        value +=s;
        m="k";
        }

    public static void main(String[] args) {
        Order order=new Order("f");
        order=new Order();
        System.out.println(order.value+order.m);
    }
}

