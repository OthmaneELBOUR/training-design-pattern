import model.Button;
import model.ComponentFactory;
import model.LinuxComponent;
import model.MacOsComponent;
import model.Window;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // ---------------------------------------------------

        ComponentFactory factMac = new MacOsComponent();
        ComponentFactory factLinux = new LinuxComponent();

        System.out.println("Creating Mac Components");

        Button b = factMac.fabricButton();
        Window w = factMac.fabricWindow();

        b.sayHi();
        w.sayHi();
        
        System.out.println("Creating Linux Components");
        
        b = factLinux.fabricButton();
        w = factLinux.fabricWindow();

        b.sayHi();
        w.sayHi();
    }
}
