package designpattern.creationaldesignpattern.builder;

public class InvalidNameException extends RuntimeException{
    public InvalidNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public InvalidNameException(Throwable cause) {
        super(cause);
    }

    public InvalidNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNameException(String message) {
        super(message);
    }

    public InvalidNameException() {
    }
}
