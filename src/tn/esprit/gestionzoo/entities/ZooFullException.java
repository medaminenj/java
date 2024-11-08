package tn.esprit.gestionzoo.entities;

public class ZooFullException extends Exception {


    public ZooFullException() {
        super();
    }

    public ZooFullException(String message) {
        super(message);
    }


    @Override
    public String toString() {
        return "ZooFullException: " + getMessage();
    }
}
