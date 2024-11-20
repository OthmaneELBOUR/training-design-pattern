public class App {
    public static void main(String[] args) throws Exception {
        Velo monVelo = new Velo(30);
        
        monVelo.setCalculateur(new Tarifjournalier());
        System.out.println("Tarifs journaliers : " + monVelo.calculerTarifs());
        
        monVelo.setCalculateur(new TarifDistance());
        System.out.println("Tarifs Distance (30 Km): " + monVelo.calculerTarifs());
        
        monVelo.setCalculateur(new TarifWeekend());
        System.out.println("Tarifs Weekend pour distance (30) : " + monVelo.calculerTarifs());
    }
}
