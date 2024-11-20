package model;

public abstract class CustomNotifyer implements Notifyer{
    protected Notifyer otherNotif;


    public CustomNotifyer(Notifyer otherNotif) {
        this.otherNotif = otherNotif;
    }
    

    public void notifier() {
        this.otherNotif.notifier();
    }
    
}
