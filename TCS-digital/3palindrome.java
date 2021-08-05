//prepinsta tcs question

import java.util.*;

class Main
{
    public static boolean isP(String str)
    {
        if(str.length() == 1)
            return true;
        StringBuffer sb = new StringBuffer(str);
        sb = sb.reverse();
        String rev = new String(sb);
        return str.equals(rev);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // a aaabaaa a
        int len = str.length();
        String s1="";
        String s2="";
        String s3="";
        int c=0;
        boolean flag = false;
        for(int i=1;i<len-1;i++)
        {
            s1 = str.substring(0,i);
            if(isP(s1))
            {
                for(int j=1;j<len-i;j++)
                {
                    s2 = str.substring(i,i+j);
                    s3 = str.substring(i+j,len);
                    c++;
                    if(isP(s2) && isP(s3) )
                    {
                        
                        System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+c);
                        flag = true;
                        break;
                    }
                }
                
                
            }
            if(flag)
                break;
        }
        if(!flag)
        {
            System.out.println("Impossible");
        }
    }
}
