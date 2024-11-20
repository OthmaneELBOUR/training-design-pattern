public abstract class DocumentFactory {

    public DocumentFactory() {
    }
    
    public Document createDocument(String nom, int taille) {
        return this.fabricate(nom, taille);
    }

    protected abstract Document fabricate(String nom, int taille);
}
