public class DeleteInArray {
    public static void main(String args[]) {

        char arr[] = { 'A', 'B', 'C', 'D', 'E' };
        DeleteInArray.deleteitem(arr, 3);
        System.out.println(arr);

    }

    public static void deleteitem(char[] ar, int pos) {
        for (int i = pos - 1; i < ar.length - 1; i++) {
            ar[i] = ar[i + 1];
        }
        ar[ar.length - 1] = ' ';
    }
}
