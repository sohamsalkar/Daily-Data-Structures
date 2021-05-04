import java.util.*;

public class BuySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sd = 0, bd = 0, profit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                sd++;
            } else {
                profit += arr[sd] - arr[bd];
                sd = i;
                bd = i;
            }
        }
        profit += arr[sd] - arr[bd];
        System.out.println(profit);
    }

    // 8
    // 1 2 3 5 4 2 1 6
    // 9
    //
    // 7
    // 1 2 3 5 4 2 1
    // 4

}
