package lesson16;

/**
 * Created by UITS-Admin on 14.06.2017.
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPasswordException{}";
    }
}
