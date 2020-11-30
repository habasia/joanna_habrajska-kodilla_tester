public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Kasia";
        names[1] = "Basia";
        names[2] = "Stasia";
        names[3] = "Hania";
        names[4] = "Bania";
        System.out.println(names[3]);
        int numberOfElements = names.length;;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}