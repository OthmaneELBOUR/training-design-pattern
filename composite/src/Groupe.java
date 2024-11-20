import java.util.List;

public class Groupe extends Element{
    private List<Element> contenu;
    public Groupe(List<Element> contenu) { // Les attributs taille et Couleur ne deverait pas être dans la classe element car un groupe n'a ni taille ni couleur
        super(0, "None");
        this.contenu = contenu;
    }

    public void printMe() {
        System.out.println("Je suis un groupe composé de ces elements : ");
        this.contenu.forEach(e -> {System.out.print("->");e.printMe();});
    }
}
