import java.util.List;

public class UserBuilder {
    private User user;

    public User getUser() {
        return this.user;
    }

    


    public UserBuilder() {
        this.user = new User();
    }

    public UserBuilder username(String value) {
        this.user.setUsername(value);
        return this;
    }

    public UserBuilder password(String value) {
        this.user.setPassword(value);
        return this;
    }

    public UserBuilder adresse(String value) {
        this.user.setAdresse(value);
        return this;
    }

    public UserBuilder preferences(List<String> value) {
        this.user.setPreferences(value);
        return this;
    }

    public UserBuilder historique(List<String> value) {
        this.user.setHistorique(value);
        return this;
    }

    public User build() {
        User copy = this.user;
        this.user = null;
        return copy;
    }
}
