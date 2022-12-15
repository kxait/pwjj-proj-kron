package pl.edu.pk.kron.visualcommunicator.common.model.messages;

import pl.edu.pk.kron.visualcommunicator.common.model.MessageType;

import java.util.UUID;

public class GetConversations extends MessageFromWebsocket {

    public GetConversations(UUID id) {
        super(id, MessageType.CLIENT_GET_CONVERSATIONS);
    }
}
