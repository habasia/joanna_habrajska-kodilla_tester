// troche nie wiem jak tu maina wpasować, zawsze go tworze w osobnej klasie
public class Application {
    public String name;
    public double age;
    public double height;


    public Application() {
        this.name = "Adam";
        this.age = 40.5;
        this.height = 178;
    }

    public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        double height = 178;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void checkFeatures() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}