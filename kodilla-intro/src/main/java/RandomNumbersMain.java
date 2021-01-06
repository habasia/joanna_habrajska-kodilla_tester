// nie rozumiem dlaczego nie działa, help :((
public class RandomNumbersMain {
    public static void main(String[] args) {
        RandomNumbers random = new RandomNumbers();
        int sum = 0;
        while (sum <= 5000) {
            random.addRandomNumber();
            sum =+ random.randomNumbers[random.size];
        }
    }
}
