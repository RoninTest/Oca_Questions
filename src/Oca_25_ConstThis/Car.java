package Oca_25_ConstThis;

public class Car {
    String brand;
    String model;
    int year;


    public Car(){

    }

    public Car(String brd, String mdl) {

        brand=brd;
        model=mdl;
    }


    public Car(String brand, String model, int year) {
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
}
