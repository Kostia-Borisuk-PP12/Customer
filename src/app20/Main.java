package app20;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Address address = new Address("Kyiv", "Shevchenko Street", "01001");

        user.setAddress(address);

        System.out.println(user.getAddress());
    }
}

