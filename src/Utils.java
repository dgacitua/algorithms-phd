import java.util.Random;

public final class Utils {
    public static void printArray(int arr[], int n) {
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\n");
    }

    public static void printArray(float arr[], int n) {
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\n");
    }

    public static int[] generateArray(int n, int min, int max) {
        Random rand = new Random();
        int[] result = new int[n];

        for (int i=0; i<n; i++) {
            result[i] = rand.nextInt((max - min) + 1) + min;
        }

        return result;
    }

    public static float[] generateArray(int n, float min, float max) {
        Random rand = new Random();
        float[] result = new float[n];

        for (int i=0; i<n; i++) {
            result[i] = min + rand.nextFloat() * (max - min);
        }

        return result;
    }
}
