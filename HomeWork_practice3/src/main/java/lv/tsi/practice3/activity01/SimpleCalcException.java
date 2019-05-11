package lv.tsi.practice3.activity01;

public class SimpleCalcException extends Exception {
    public SimpleCalcException(String message) {
        super(message);
    }

    public SimpleCalcException(String message, Throwable cause) {
        super(message, cause);
    }
}
