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
        Application application = new Application();
        application.checkFeatures();
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
            if (getAge() > 30 && getHeight() > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

}