public class FactoryHTML extends DocumentFactory{
    public Document fabricate(String nom, int taille) {
        return new DocumentHTML(nom, taille);
    }
}
