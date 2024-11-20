public class FactoryPDF extends DocumentFactory{

    public Document fabricate(String nom, int taille) {
        return new DocumentPDF(nom, taille);
    }
}
