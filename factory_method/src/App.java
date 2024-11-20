public class App {
    public static void main(String[] args) throws Exception {
        DocumentFactory docFact = new FactoryHTML();
        
        Document monDoc = docFact.createDocument("DOC HTML", 10);
        System.out.println(monDoc.getType());
        
        docFact = new FactoryPDF();

        monDoc = docFact.createDocument("DOC PDF", 10);
        System.out.println(monDoc.getType());
    }
}
