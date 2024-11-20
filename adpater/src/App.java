public class App {
    public static void main(String[] args) throws Exception {
        BiblioInterne bib = new PayementAdapt(new BiblioExterne());

        bib.processPayment(30000, "123456789");

        System.out.println(bib.verifyPayment("123456798"));
    }
}
