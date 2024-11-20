public class LogManager {
    private static LogManager instance;

    private LogManager() {

    }

    public static LogManager createLogManager() {
        if (instance == null) {
            instance = new LogManager();
        }

        return instance;
    }
}
