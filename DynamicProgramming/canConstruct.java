import java.util.*;
import java.lang.*;

public class canConstruct {

    public static boolean canwe(String tar, String[] wor) {
        if (memo.containsKey(tar))
            return memo.get(tar);
        if (tar == "")
            return true;

        for (String e : wor) {
            if (tar.indexOf(e) == 0) {
                String suf = tar.substring(e.length());
                if (canwe(suf, wor) == true) {
                    memo.put(tar, true);
                    return true;
                }

            }
        }
        memo.put(tar, false);
        return false;
    }

    static Map<String, Boolean> memo = new HashMap<>();
    final static String[] wor = { "e", "ee", "eee", "eeee" };

    public static void main(String[] args) {

        System.out.println(canwe("eeeeeeeeet", wor));
        // System.out.println(memo);
    }

}