public class ColorGenerator {
    public String generate() {
        String color = UserDialogsColors.getColor();
        switch (color) {
            case "R": return "red";
            case "B": return "blue";
            case "G": return "green";
            case "Y": return "yellow";
            default: return "nuthin";
        }
    }
}

