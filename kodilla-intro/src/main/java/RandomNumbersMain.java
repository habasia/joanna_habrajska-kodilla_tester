public class RandomNumbersMain {
    public static void main(String[] args) {
        RandomNumbers random = new RandomNumbers();
        int sum = 0;
        while (sum <= 5000) {
            random.addRandomNumber();
            sum += random.addRandomNumber();
        }

        System.out.println("Min: " + random.getMinimum());
        System.out.println("Max: " + random.getMaximum());
    }
}
