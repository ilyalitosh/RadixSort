import java.util.Random;

public class Test {

    public static void main(String[] args) {
        long[] input = generate(1000000);

        long startTime3 = System.currentTimeMillis();
        RadixSort.sort(input);
        long endTime3 = System.currentTimeMillis();

        System.out.println("Total time(Radix): " + ((endTime3 - startTime3) / 1000.0) + " sec");
    }

    private static long[] generate(int count) {
        Random random = new Random();

        long[] array = new long[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000000000);
        }
        return array;
    }

}
