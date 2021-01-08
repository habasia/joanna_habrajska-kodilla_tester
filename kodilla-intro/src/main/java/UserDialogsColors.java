import java.util.Scanner;
public class UserDialogsColors {

    public static String getColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letter (R-Red, B-Blue, G-Green, Y-Yellow)");
        String color = scanner.nextLine();
        return color;
    }
}