public abstract class Element {
    protected int taille;
    protected String color;


    protected Element(int taille, String color) {
        this.taille = taille;
        this.color = color;
    }

    public int getTaille() {
        return this.taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void printMe();

}