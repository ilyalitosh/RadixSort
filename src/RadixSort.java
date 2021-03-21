
/**
 * RadixSort
 *
 * @author Ilya Litosh
 */
public class RadixSort {

    /**
     * Doing sort of decimal array numbers
     *
     * @param input     input array to sort
     */
    public static void sort(long[] input) {
        long max = getMax(input);
        int maxDigitCount = getDigitsCount(max);

        long[][] tempArray = new long[10][input.length];
        for (int i = 1; i <= maxDigitCount; i++) {
            for (int j = 0; j < input.length; j++) {
                int digit = (int) getDigit(input[j], i);

                tempArray[digit][0] += 1;

                int index = (int) tempArray[digit][0];
                tempArray[digit][index] = input[j];
            }

            int index = 0;
            for (int k = 0; k < tempArray.length; k++) {
                for (int l = 1; l <= tempArray[k][0]; l++) {
                    input[index] = tempArray[k][l];
                    index++;
                }
                tempArray[k][0] = 0;
            }
        }
    }

    private static long getMax(long[] input) {
        long max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }

    private static long getDigit(long number, int index) {
        long divider = (long) Math.pow(10, index);

        // Optimization of dividing to 10
        int invDivisor = 0x1999999A;
        long divided = (invDivisor * divider) >> 32;

        return (number % (divider)) / divided;
    }

    private static int getDigitsCount(long number) {
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        return length;
    }

}
