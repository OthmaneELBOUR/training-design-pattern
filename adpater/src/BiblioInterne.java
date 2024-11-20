public interface BiblioInterne {
    void processPayment(double amount, String accountId);
    boolean verifyPayment(String transactionId);

}
