package app18;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("logger1 == logger2 ? " + (logger1 == logger2));

        logger1.log("Програма стартувала");
        logger2.log("Ініціалізація користувача");
        logger1.log("Дані успішно збережені");

        logger1.printLogs();
    }
}
