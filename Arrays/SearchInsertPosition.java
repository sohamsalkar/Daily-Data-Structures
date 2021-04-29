//

import java.util.Scanner;

public class SearchInsertPosition {

    static int getPos(int arey[], int x) {
        // binary search
        int l = 0;
        int size = arey.length - 1;
        int m;
        while (l <= size) {
            m = l + (size - 1) / 2;
            if (x == arey[m])
                return m;
            else if (arey[m] > x)
                size = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arey[] = new int[n];

        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arey[i] = sc.nextInt();
        }

        System.out.print("Enter number to find pos: ");
        int x = sc.nextInt();

        int pos = getPos(arey, x);
        System.out.print("pos: " + (pos + 1) + "\n");

    }

}
