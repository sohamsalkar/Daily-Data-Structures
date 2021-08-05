import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int p = sc.nextInt();
        
        int even = high/2 - (low-1)/2; 
        int odd = (high+1)/2 - low/2; 
        int esum =1;
        int osum = 0;
        
        for(int i=0;i<p;i++)
        {
            int peven = esum;
            int podd = osum;
            esum = peven*even + podd*odd;
            osum = peven*odd + podd*even;
        }
        System.out.println(esum);
        
    }
}
