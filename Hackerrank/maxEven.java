import java.util.*;
import java.lang.*;

class maxEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str[] = sc.nextLine().split(""); // asdf@75483
        String str = sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int x = Character.getNumericValue(str.charAt(i));
                arr.add(x);
            }
        }
        // arr = 7,5,4,8,3
        Collections.sort(arr, Collections.reverseOrder());
        // arr = 8 7 5 4 3 || 9 6 5 3 1
        int size = arr.size();
        int i, flag = 0;
        for (i = size - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            String ans = "";
            if (i != size - 1) // i = 1
            {
                for (int j = 0; j < size; j++) {
                    if (j == i)
                        continue;
                    else
                        ans = ans + Integer.toString(arr.get(j));
                }
                ans = ans + Integer.toString(arr.get(i));
            } else {
                for (int j = 0; j < size; j++)
                    ans = ans + Integer.toString(arr.get(j));
            }
            System.out.println(ans);
        } else
            System.out.println("all odd");
    }

}

// asdf@75483