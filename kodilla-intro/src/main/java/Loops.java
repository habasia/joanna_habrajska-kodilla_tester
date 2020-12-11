public class Loops {
    public static int sum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 3, 1};
        int result = sum(numbers);
        System.out.println(result);
    }
}