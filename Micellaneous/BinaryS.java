public class BinaryS {

    public static void main(String args[]) {
        int[] arr = { 1, 3, 5, 6, 7, 8, 9, 11, 12, 13 };
        int size = arr.length;
        System.out.println(bs(arr, 15, 0, size - 1));
    }

    public static int bs(int[] arr, int key, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                return bs(arr, key, start, mid - 1);
            } else if (key > arr[mid]) {
                return bs(arr, key, mid + 1, end);
            }
        }
        return -1;
    }
}