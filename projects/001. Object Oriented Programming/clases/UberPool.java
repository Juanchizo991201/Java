package CursoPOO.clases;

/*
 * UberPool class, is a sub-class of Car
 */

public class UberPool extends Car {

    String brand;
    String model;

    /**
     * @param license
     * @param driver
     * @param passengers
     * @param brand
     * @param model
     */
    public UberPool(String license, Driver driver, int passengers, String brand, String model) {
        super(license, driver, passengers);
        this.brand = brand;
        this.model = model;
    }    
}
