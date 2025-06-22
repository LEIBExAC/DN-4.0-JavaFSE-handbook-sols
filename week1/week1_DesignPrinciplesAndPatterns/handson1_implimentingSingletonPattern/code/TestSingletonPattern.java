class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String log) {
        System.out.println(log);
    }
}

public class TestSingletonPattern {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Log 1");

        Logger logger2 = Logger.getInstance();
        logger2.log("Log 2");

        if (logger1 == logger2) {
            System.out.println("The logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("Different instances exist!");
        }
    }
}