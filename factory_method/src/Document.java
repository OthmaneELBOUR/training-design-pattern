public abstract class Document {
    protected String nom;
    protected int taille;


    public Document(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTaille() {
        return this.taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public abstract String getType();

}