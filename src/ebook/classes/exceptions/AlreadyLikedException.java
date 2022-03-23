package ebook.classes.exceptions;

public class AlreadyLikedException extends RuntimeException {
    public AlreadyLikedException() {
        super();
    }

    public AlreadyLikedException(String message) {
        super(message);
    }
}
