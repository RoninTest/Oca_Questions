package Oca_25_ConstThis;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.brand="Toyota";
        car1.model="Corolla";
        car1.year=2020;

        System.out.print("Brand : " + car1.brand + "\n" +
                         "Model : " + car1.model + "\n" +
                         "Year :" + car1.year + "\n" +
                         "***********"+"\n");

        Car car2=new Car("Volkswagen","Golf");
        System.out.print("Brand : " + car2.brand + "\n" +
                "Model : " + car2.model + "\n" +
                "***********" +"\n");

        Car car3=new Car("Nissan","Micra",2022);
        System.out.println("Brand : " + car3.brand + "\n" +
                "Model : " + car3.model + "\n" +
                "Year :" + car3.year + "\n" +
                "***********"+"\n");
    }
}
