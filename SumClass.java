public class SumClass {

    /**
     * This method calculates the sum of the series 1 + 0.9 + 0.8 + ... + 0.1.
     * @return The total sum of the series.
     */
    public static double calculateSum() {
        double sum = 0.0;
        double currentValue = 1.0; // Starting value
        double step = 0.1; // Step to decrement each time

        while (currentValue >= 0.1) {
            sum += currentValue;
            currentValue = Math.round((currentValue - step) * 10.0) / 10.0; // To avoid floating-point precision issues
        }

        return sum;
    }

    /**
     * Main method to run the program and display the result.
     */
    public static void main(String[] args) {
        double result = calculateSum();
        System.out.printf("The sum of the series 1 + 0.9 + 0.8 + ... + 0.1 is: %.2f\n", result);
    }
}
