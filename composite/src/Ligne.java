public class Ligne extends Element{
    public Ligne(int taille, String color) {
        super(taille, color);
    }

    public void printMe() {
        System.out.println("Je suis une ligne de taille " + this.taille + "px et de couleur " + this.color);
    }
}
