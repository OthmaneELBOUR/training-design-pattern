import java.util.ArrayList;
import java.util.List;

public class Messagerie {
    private List<String> conversation;
    private List<Observateur> observ;
    

    public Messagerie(List<String> conversation) {
        this.conversation = conversation;
        this.observ = new ArrayList<>();
    }

    public List<String> getConversation() {
        return this.conversation;
    }

    public void setConversation(List<String> conversation) {
        this.conversation = conversation;
    }

    public void subscribe(Observateur observateur) {
        this.observ.add(observateur);
    }

    public void unsubscribe(Observateur observateur) {
        this.observ.remove(observateur);
    }

    public void addMessage(String message) {
        this.conversation.add(message);
        this.notifier();
    }

    public void notifier() {
        this.observ.forEach(e -> e.update());
    }

    public String getLastMessage() {
        return this.conversation.getLast();
    }

}