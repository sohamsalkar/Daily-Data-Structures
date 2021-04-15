
import java.util.*;

class intAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(",");
        int n = str.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int ex = 0;
        String sin = "";
        for (int i = 0; i < n; i++) {
            if (arr[i] == 4) {
                while (arr[i] != 7) {
                    sin = sin + Integer.toString(arr[i]);
                    i++;
                }
                sin = sin + "7";
            } else {
                ex += arr[i];
            }
        }

        int temp = Integer.parseInt(sin) + ex;
        System.out.println(sin);
        System.out.println(ex);
        System.out.println(temp);

    }

}

// 3,1,6,4,2,3,7,2