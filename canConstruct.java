import java.util.*;
import java.lang.*;

public class canConstruct {

    public static boolean canwe(String tar, String[] wor) {
        if (tar == "")
            return true;

        for (String e : wor) {
            if (tar.indexOf(e) == 0) {
                String suf = tar.substring(e.length());
                if (canwe(suf, wor) == true)
                    return true;
            }
        }
        return false;
    }

    final static String[] wor = { "e", "ee", "eee", "eeee" };

    public static void main(String[] args) {

        System.out.println(canwe("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeet", wor));
    }

}