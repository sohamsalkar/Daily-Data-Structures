
public class Test {
    public static void main(String args[]) {
        int arr[] = { 7, 5, 2, 3, 4, 1, 6 };
        bs(arr);

    }

    static void bs(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("  ");

            }
            System.out.println(" ");
        }

    }
}
