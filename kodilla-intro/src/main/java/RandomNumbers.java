import java.util.Random;

public class RandomNumbers {
    public int[] randomNumbers;
    public int size;

    //konstruktor
    public RandomNumbers() {
        this.randomNumbers = new int[0];
        this.size = 0;
    }

    //generator losowej liczby
    public int getRandomNumber() {
        Random random = new Random(System.currentTimeMillis());
        return random.nextInt(31);
    }

    //dodawanie liczby do tablicy
    public void addRandomNumber() {
        this.size++;
        int[] newRandomNumbers = new int[this.size];
        System.arraycopy(randomNumbers,0,newRandomNumbers,0,randomNumbers.length);
        newRandomNumbers[this.size - 1] = getRandomNumber();
        randomNumbers = newRandomNumbers;
    }
}
