package CursoPOO.main;

import CursoPOO.clases.*;

public class main {

    /**
     * @param args
     */
    public static void main (String[] args) {

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }

        Driver driver1 = new Driver("Juan", "1016113926", "Juanchizo991201@gmail.com");
        // System.out.println(driver1.toString());
        Driver driver2 = new Driver("Elias", "93355947", "elias.montenegro0@gmail.com");
        // System.out.println(driver1.toString());

        UberX uberx1 = new UberX("QHV-453", driver1, "Chevrolet", "Swift");
        uberx1.setPassengers(4);
        System.out.println(uberx1.toString());

        UberVan ubervan1 = new UberVan("JVW-855", driver2);
        ubervan1.setPassengers(6);
        System.out.println(ubervan1.toString());
    }    
}
