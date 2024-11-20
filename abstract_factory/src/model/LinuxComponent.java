package model;

public class LinuxComponent extends ComponentFactory{
    public Button fabricButton() {
        return new LinuxButton();
    }

    public Window fabricWindow() {
        return new LinuxFenetre();
    }
}
