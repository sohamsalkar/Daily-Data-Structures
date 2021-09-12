import java.util.*;

class rp {
    public static void main(String args[]) {
        int n = 2;
        int k = 4;
        int res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * n;
        }
        System.out.println(res);

        System.out.println(Math.pow(n, k));

    }
}