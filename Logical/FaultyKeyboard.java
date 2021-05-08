import java.util.*;

public class FaultyKeyboard {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String typed = sc.next();
        if (checkBoth(name, typed))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean checkBoth(String name, String typed) {
        if (name.length() > typed.length())
            return false;
        int i = 0;
        int j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else
                return false;
        }
        while (j < typed.length()) {
            if (typed.charAt(j) != name.charAt(i - 1))
                return false;
            j++;
        }

        if (i < name.length())
            return false;
        else
            return true;
    }
}

/*
 * soham sssohaamm
 */