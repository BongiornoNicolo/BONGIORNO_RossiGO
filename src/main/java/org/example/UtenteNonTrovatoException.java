package org.example;

public class UtenteNonTrovatoException extends RossiGoException {
    public UtenteNonTrovatoException(String message) {
        super(message);
    }
    public UtenteNonTrovatoException(String message, Throwable cause) {
        super(message, cause);
    }
}
