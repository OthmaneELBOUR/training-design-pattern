import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Messagerie messagerie = new Messagerie(new ArrayList<String>());
        Observateur observateur = new ObservateurNewMessage(messagerie);

        messagerie.subscribe(observateur);

        System.out.print("Ecrire le message a envoyer : ");
        Scanner sc = new Scanner(System.in);
        messagerie.addMessage(sc.nextLine());
        sc.close();
    }
}
