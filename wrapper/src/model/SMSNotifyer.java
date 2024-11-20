package model;

public class SMSNotifyer extends CustomNotifyer{
    
    public SMSNotifyer(Notifyer notifyer) {
        super(notifyer);
    }

    public void notifier() {
        super.notifier();
        System.out.println("Sending SMS....");
    }
}
