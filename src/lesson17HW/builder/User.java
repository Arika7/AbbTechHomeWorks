package lesson17HW.builder;

public class User {
    private String name;
    private int age;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }



    public static UserBuilder userBuilder(){
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private int age;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
