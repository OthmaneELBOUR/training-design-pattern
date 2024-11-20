import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Element e1 = new Ligne(10, "Rouge");
        Element e2 = new Ligne(23, "Bleu");
        Element e3 = new Cercle(10, "Vert");
        Element e4 = new Cercle(29, "Orange");

        Element grp1 = new Groupe(List.of(e1, e2, e3));
        Element grp2 = new Groupe(List.of(e4, grp1));

        grp2.printMe();
    }
}
