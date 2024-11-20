import java.util.List;

public class User {
    private String username;
    private String password;
    private String adresse;
    private List<String> preferences;
    private List<String> historique;


    public User(String username, String password, String adresse, List<String> preferences, List<String> historique) {
        this.username = username;
        this.password = password;
        this.adresse = adresse;
        this.preferences = preferences;
        this.historique = historique;
    }

    public User() {
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<String> getPreferences() {
        return this.preferences;
    }

    public void setPreferences(List<String> preferences) {
        this.preferences = preferences;
    }

    public List<String> getHistorique() {
        return this.historique;
    }

    public void setHistorique(List<String> historique) {
        this.historique = historique;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.username != null) {
            sb.append(username + " \n");
        }
        if (this.password != null) {
            sb.append(password + " \n");
        }
        if (this.adresse != null) {
            sb.append(adresse + " \n");
        }
        if (this.preferences != null) {
            sb.append(preferences + " \n");
        }
        if (this.historique != null) {
            sb.append(historique + " \n");
        }
        return sb.append("--------------------------").toString();
    }

}