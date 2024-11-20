public class DocumentPDF extends Document {
    
    public DocumentPDF(String nom, int taille) {
        super(nom, taille);
    }

    public String getType() {
        return "Je suis un docuemnt PDF";
    }
}
