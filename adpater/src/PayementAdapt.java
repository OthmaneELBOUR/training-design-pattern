public class PayementAdapt implements BiblioInterne{
    private BiblioExterne biblio;

    public PayementAdapt(BiblioExterne biblio) {
        this.biblio = biblio;
    }

    public BiblioExterne getBiblio() {
        return this.biblio;
    }

    public void setBiblio(BiblioExterne biblio) {
        this.biblio = biblio;
    }

    public void processPayment(double amount, String accountId) {
        this.biblio.initializePayment(amount);
        this.biblio.makePayment(accountId);
    }
    public boolean verifyPayment(String transactionId) {
        return this.biblio.checkPaymentStatus(transactionId);
    }
}
