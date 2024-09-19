public class FirstAndLastDigit {
    public static void main(String[] args) {
        System.out.print(sumFirstAndLastDigit(252));
        System.out.print(sumFirstAndLastDigit(257));
        System.out.print(sumFirstAndLastDigit(0));
        System.out.print(sumFirstAndLastDigit(5));
        System.out.print(sumFirstAndLastDigit(-10));
    }

    private static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;


        int firstdigit = 0;

        while (number > 0) {
            firstdigit = number;
            number /= 10;
        }

        return lastDigit + firstdigit;

    }
}
