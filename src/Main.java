public class Main {
    public static void main(String[] args) {
        int n = 10000;
        int arr[] = Utils.generateArray(n, 0, 1000);

        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();

        Radix.sortBenchmark(arr1, n);
        Bucket.sortBenchmark(arr2, n);

        Utils.printArray(arr, n);
        Utils.printArray(arr1, n);
        Utils.printArray(arr2, n);
    }
}