public class ObservateurNewMessage implements Observateur{
    private Messagerie messagerie;

    public ObservateurNewMessage(Messagerie messagerie) {
        this.messagerie = messagerie;
    }

    public void update() {
        System.out.print("Nouveaux Message Detetcté : ' ");
        System.out.print(messagerie.getLastMessage());
        System.out.println(" '");
    } 
}
