public class BiblioExterne {
    public void initializePayment(double amount) {
        System.out.println("Payment of $" + amount + " initialized using ExternalPaymentProcessor.");
    }

    public void makePayment(String accountId) {
        System.out.println("Payment made to account: " + accountId + " using ExternalPaymentProcessor.");
    }

    public boolean checkPaymentStatus(String transactionId) {
        System.out.println("Checking payment status for transaction: " + transactionId);
        return true; // Simulation d'un paiement réussi
    }

}
