package ebook.classes.exceptions;

public class AlreadyDislikedException extends RuntimeException {
    public AlreadyDislikedException() {
        super();
    }

    public AlreadyDislikedException(String message) {
        super(message);
    }
}
