package CursoPOO.clases;

/*
 * UberX class, is a sub-class of Car
 */

public class UberX extends Car {

    String brand;
    String model;

    public UberX(String license, Driver driver,String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

   @Override
   public String toString() {
       System.out.println("Brand: " + brand + ", Model: " + model);
       return super.toString();       
   }
}
