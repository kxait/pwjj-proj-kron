package pl.edu.pk.kron.visualcommunicator.common.model;

public enum MessageType {
    CLIENT_GET_AUTH,
    CLIENT_GET_CONVERSATIONS,
    CLIENT_GET_MESSAGES,
    CLIENT_SEND_MESSAGE,
    CLIENT_CREATE_NEW_CONVERSATION,

    SERVER_NEW_MESSAGE,
    SERVER_NEW_CONVERSATION,
    SERVER_ERR
}