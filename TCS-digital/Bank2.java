
/*
Problem Statement-:  There are two banks – Bank A and Bank B. Their interest rates vary. You have received offers from both banks in terms of the annual rate of interest, tenure, and variations of the rate of interest over the entire tenure.You have to choose the offer which costs you least interest and reject the other. Do the computation and make a wise choice.

The loan repayment happens at a monthly frequency and Equated Monthly Installment (EMI) is calculated using the formula given below :

EMI = loanAmount * monthlyInterestRate / ( 1 – 1 / (1 + monthlyInterestRate)^(numberOfYears * 12))

*/
import java.util.*;
import java.lang.*;
import java.math.*;

class Bank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int n1 = sc.nextInt();
        int pra = 0, prb = 0;
        float rta = 0f, rtb = 0f;
        double emia = 0.0, emib = 0.0;
        while (n1-- > 0) {
            pra = sc.nextInt();
            rta = sc.nextFloat();
            emia += p * (float) rta / (1 - 1 / Math.pow((1 + rta), (pra * 12)));
        }
        int n2 = sc.nextInt();
        while (n2-- > 0) {
            prb = sc.nextInt();
            rtb = sc.nextFloat();
            emib += p * (float) rtb / (1 - 1 / Math.pow((1 + rtb), (prb * 12)));
        }
        if (emia < emib)
            System.out.println(emia + "A" + emib);
        else
            System.out.println("B");

    }
}