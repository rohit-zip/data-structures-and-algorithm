package numberSystem;

public class DigitFrequency {
    public static void main(String[] args) {
        int number = 99346928;
        int target = 9;
        int frequency = getDigitFrequency(number, target);
        System.out.println(frequency);
    }

    public static int getDigitFrequency(int number, int target) {
        int count = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            number = number/10;
            if (target == lastDigit) {
                count++;
            }
        }
        return count;
    }
}
