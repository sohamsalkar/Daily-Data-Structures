class Quicksort {
    public static void main(String args[]) {
        int arr[] = { 0, 0, 1, 1, 1, 1, 1, 3, 3, 3, 2, 2, 2, 1 }; //
        int n = arr.length;
        qs(arr, 0, n - 1);
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void qs(int arr[], int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            qs(arr, start, pi - 1);
            qs(arr, pi + 1, end);
        }
    }

    public static int partition(int arr[], int start, int end) {
        int pi = start;
        int i = start;
        int j = end;
        while (i < j) {
            while (arr[i] < arr[pi] && i < j) {
                i++;
            }
            while (arr[j] >= arr[pi] && i < j) {
                j--;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            } else if (i == j) {
                int t = arr[i];
                arr[i] = arr[pi];
                arr[pi] = t;
            }
        }
        return i;
    }

}