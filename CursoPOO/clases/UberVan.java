package CursoPOO.clases;

/*
 * UberVan class, is a sub-class of Car
 */

public class UberVan extends Car {

    String typeCarAccepted;
    String seatsMaterial;

    /**
     * @param license
     * @param driver
     * @param passengers
     * @param typeCarAccepted
     * @param seatsMaterial
     */
    public UberVan(String license, Driver driver, int passengers, String typeCarAccepted, String seatsMaterial) {
        super(license, driver, passengers);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    /**
     * @param license
     * @param driver
     */
    public UberVan(String license, Driver driver) {
        super(license, driver);
    }
    
    @Override
    public void setPassengers(int passengers) {
        if (passengers == 6){
            super.passengers = passengers;
        } else {
            System.out.println("Se necesitan asignar 6 pasajeros");
        }
    }
}
