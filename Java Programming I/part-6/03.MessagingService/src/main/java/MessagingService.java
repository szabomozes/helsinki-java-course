import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;

    public MessagingService() {
        messages = new ArrayList<>();

    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(new Message(message.getSender(), message.getContent()));
        }
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }
}
