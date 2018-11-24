package shild.listam.exception;

public class MyEx extends Exception {
    public MyEx() {
    }

    public MyEx(String message) {
        super(message);
    }

    public MyEx(String message, Throwable cause) {
        super(message, cause);
    }

    public MyEx(Throwable cause) {
        super(cause);
    }

    public MyEx(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
