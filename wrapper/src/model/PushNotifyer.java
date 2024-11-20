package model;

public class PushNotifyer extends CustomNotifyer{
    public PushNotifyer(Notifyer notifyer) {
        super(notifyer);
    }

    public void notifier() {
        super.notifier();
        System.out.println("Sending Push Notif....");
    }
}
