package app13;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        int searchId = 2;
        Optional<User> userById = repo.findUserById(searchId);
        userById.ifPresentOrElse(
                user -> System.out.println("Знайдений користувач за id " + searchId + ": " + user),
                () -> System.out.println("Користувача з id " + searchId + " не знайдено")
        );

        String searchEmail = "charlie@example.com";
        Optional<User> userByEmail = repo.findUserByEmail(searchEmail);
        userByEmail.ifPresentOrElse(
                user -> System.out.println("Знайдений користувач за email " + searchEmail + ": " + user),
                () -> System.out.println("Користувача з email " + searchEmail + " не знайдено")
        );

        Optional<List<User>> allUsers = repo.findAllUsers();
        allUsers.ifPresentOrElse(
                list -> System.out.println("Кількість користувачів: " + list.size()),
                () -> System.out.println("Список користувачів порожній")
        );
    }
}
