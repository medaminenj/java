package tn.esprit.gestionzoo.entities;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("l age de lanimal ne peut pas etre negagtive");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
