package CursoPOO.clases;

/*
 *  Car class, is the superclass of UberBlack, UberPool, UberVan and UberX classes
 */

public class Car {

    private int id;
    private String license;
    private Driver driver;
    protected int passengers;
    
    /**
     * @param license
     * @param driver
     * @param passengers
     */
    public Car(String license, Driver driver, int passengers) {
        this.license = license;
        this.driver = driver;
        this.passengers = passengers;
    }

    /**
     * @param license
     * @param driver
     * @param passengers
     */
    public Car(String license, Driver driver) {
        this.license = license;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if (passengers == 4){
            this.passengers = passengers;
        } else {
            System.out.println("Se necesitan asignar 4 pasajeros");
        }
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", license=" + license + ", driver=" + driver + ", passengers=" + passengers + "]";
    }
}