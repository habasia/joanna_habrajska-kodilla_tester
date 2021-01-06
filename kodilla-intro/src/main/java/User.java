public class User {

    String name;
    int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User basia = new User("Basia",51);
        User kasia = new User("Kasia",42);
        User stasia = new User("Stasia",47);
        User lasia = new User("Lasia", 70);

        User[] users = {basia, kasia, stasia, lasia};
        belowAverage(users);
    }

    public static double getAverage(User[] users) {
        double result = 0;
        for (int i = 0; i < users.length; i++) {
            result += users[i].age;
        }
        result = result/users.length;
        return result;
    }

    public static void belowAverage(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < getAverage(users)) {
                System.out.println(users[i].name);
            }
        }
    }
}
