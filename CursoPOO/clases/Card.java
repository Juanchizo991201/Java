package CursoPOO.clases;

import java.sql.Date;

/*
 * Card class, is a sub-class of Payment
 */

public class Card extends Paymnet{

    int number;
    int cvv;
    Date expDate;

    /**
     * @param number
     * @param cvv
     * @param expDate
     */
    public Card(int number, int cvv, Date expDate) {
        this.number = number;
        this.cvv = cvv;
        this.expDate = expDate;
    }    
}
