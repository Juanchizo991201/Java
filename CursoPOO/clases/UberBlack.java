package CursoPOO.clases;

/*
 * UberBlack class, is a sub-class of Car
 */

public class UberBlack extends Car{
    
    String typeCarAccepted;
    String seatsMaterial;

    /**
     * @param license
     * @param driver
     * @param passengers
     * @param typeCarAccepted
     * @param seatsMaterial
     */
    public UberBlack(String license, Driver driver, int passengers, String typeCarAccepted, String seatsMaterial) {
        super(license, driver, passengers);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

}
