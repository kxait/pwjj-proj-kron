package pl.edu.pk.kron.visualcommunicator.common.model.message_contents;

public class Token {
    private final String token;

    public Token(String token) {
        this.token = token;
    }

    public String getValue() {
        return token;
    }
}