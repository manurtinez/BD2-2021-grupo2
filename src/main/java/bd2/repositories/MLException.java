package bd2.repositories;

/**
 * Esta clase extiende las Excepciones nativas de Java para posiblemente dar mas
 * funcionalidad.
 */
public class MLException extends Exception {
    public MLException(String message) {
        super(message);
    }
}
