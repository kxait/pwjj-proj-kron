package pl.edu.pk.kron.visualcommunicator.common.model.messages;

import pl.edu.pk.kron.visualcommunicator.common.model.MessageType;

import java.util.UUID;

public class WhoAmIResponse extends MessageToWebsocket {
    private final UUID userId;
    private final String userName;

    public WhoAmIResponse(UUID id, UUID userId, String userName) {
        super(MessageType.CLIENT_WHO_AM_I, id);
        this.userId = userId;
        this.userName = userName;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
