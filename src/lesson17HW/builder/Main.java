package lesson17HW.builder;

public class Main {
    static void main() {
        User user = User.userBuilder().name("Arif").age(34).build();

        System.out.println(user);
    }
}
