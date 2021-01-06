public class RandomNumbersMain {
    public static void main(String[] args) {
        //tworzenie obiektu
        RandomNumbers random = new RandomNumbers();
        int sum = 0;
        //sprawdzenie warunku
        while (sum <= 5000) {
            // dodawanie liczby do tablicy
            random.addRandomNumber();
            // sumowanie elementów
            sum += random.addRandomNumber();
        }

        //wyświetlanie wyników
        System.out.println("Min: " + random.getMinimum());
        System.out.println("Max: " + random.getMaximum());
    }
}
