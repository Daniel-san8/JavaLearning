package entities;

public class ExceptionAccount extends RuntimeException {
    ExceptionAccount(String message) {
        super(message);
    }

}
