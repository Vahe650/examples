package shild.educationCenter.storage;

import shild.educationCenter.model.Message;

public class MessageStorage {
    private Message[] messages = new Message[16];
    private int size = 0;

    public void add(Message message) {
        if (size == messages.length) {
            extend();
        }
        messages[size++] = message;
    }

    private void extend() {
        Message[] tmp = new Message[messages.length + 10];
        System.arraycopy(messages, 0, tmp, 0, messages.length);
        messages = tmp;
    }

    public Message getMessageFromUser(String email) {
        for (int i = 0; i < size; i++) {
            if (messages[i].getTo().equalsIgnoreCase(email) && messages[i].isRead()) {
                return messages[i];
            }
        }
        return null;
    }

    public void getMessageByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (messages[i].getTo().equalsIgnoreCase(email) && messages[i].isRead()) {
                System.out.println(messages[i].getText());
            }
        }
    }
}