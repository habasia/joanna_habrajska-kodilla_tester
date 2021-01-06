import java.util.Random;

public class RandomNumbers {
    public int[] randomNumbersArray;
    public int size;
    public int min;
    public int max;

    //konstruktor
    public RandomNumbers() {
        this.randomNumbersArray = new int[0];
        this.size = 0;
        this.min = 0;
        this.max = 30;
    }

    //generator losowej liczby
    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(max + 1);
    }

    //dodawanie liczby do tablicy
    public int addRandomNumber() {
        this.size++;
        int[] newRandomNumbers = new int[this.size];
        System.arraycopy(this.randomNumbersArray, 0, newRandomNumbers, 0, randomNumbersArray.length);
        newRandomNumbers[this.size - 1] = getRandomNumber();
        this.randomNumbersArray = newRandomNumbers;
        return this.randomNumbersArray[this.size - 1];
    }

    public int getMinimum() {
        int min = this.max;
        for (int i = 0; i < this.randomNumbersArray.length; i++) {
            if (min > randomNumbersArray[i]) {
                min = randomNumbersArray[i];
            }
        }
        return min;
    }

    public int getMaximum() {
        int max = this.min;
        for (int i = 0; i < this.randomNumbersArray.length; i++) {
            if (max < randomNumbersArray[i]) {
                max = randomNumbersArray[i];
            }
        }
        return max;
    }
}
