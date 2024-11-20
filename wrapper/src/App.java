import model.EmailNotify;
import model.Notifyer;
import model.PushNotifyer;
import model.SMSNotifyer;

public class App {
    public static void main(String[] args) throws Exception {
        Notifyer notif = new EmailNotify();
        notif.notifier();
        System.out.println("-------------------------------");

        notif = new SMSNotifyer(notif);
        notif.notifier();
        System.out.println("-------------------------------");

        notif = new PushNotifyer(notif);
        notif.notifier();
        System.out.println("-------------------------------");


    }
}
