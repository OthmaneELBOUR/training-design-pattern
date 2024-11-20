public class Cercle extends Element{
    public Cercle(int taille, String color) {
        super(taille, color);
    }

    public void printMe() {
        System.out.println("Je suis un cercle de rayon " + this.taille + "px et de couleur " + this.color);
    }
}
