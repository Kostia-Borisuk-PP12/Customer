package app17;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator generator = new PasswordGenerator();

        String password = generator.generatePassword(12);
        System.out.println("Згенерований пароль: " + password);
        System.out.println("Довжина пароля: " + password.length());
    }
}

