package CursoPOO.clases;

/*
 *  Account class, is the superclass of Driver & User classes
 */

public class Account {

    int id;
    String name;
    String document;
    String email;
    String password;


    /**
     * Constructor where all the parameters are needed
     * 
     * @param name
     * @param document
     * @param email
     * @param password
     */
    public Account(String name, String document, String email, String password) {
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;
    }


    /**
     * Constructor where all the parameters are needed
     * @param name
     * @param document
     * @param email
     */
    public Account(String name, String document, String email) {
        this.name = name;
        this.document = document;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", document=" + document + ", email=" + email + ", password="
                + password + "]";
    }
}
