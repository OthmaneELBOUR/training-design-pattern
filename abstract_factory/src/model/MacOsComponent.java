package model;

public class MacOsComponent extends ComponentFactory {
    public Button fabricButton() {
        return new MacOSButton();
    }

    public Window fabricWindow() {
        return new MacOsFenetre();
    }
}
