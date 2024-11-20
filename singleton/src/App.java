public class App {
    public static void main(String[] args) throws Exception {
        LogManager log1 = LogManager.createLogManager();
        
        System.out.println("MANAGER 1 : " + log1);

        LogManager log2 = LogManager.createLogManager();

        System.out.println("MANAGER 2 : " + log2);
    }
}
