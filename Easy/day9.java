//[Richest Customer Wealth]
//https://leetcode.com/problems/richest-customer-wealth/
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

import java.util.Scanner;
import java.util.Arrays;

public class day9 {
    public static int maximumWealth(int[][] accounts) {
        int sum=0,max=0;
        for (int customer = 0; customer < accounts.length; customer++) {
            sum=0;
            for(int bank=0; bank<accounts[customer].length; bank++)
            {
                sum= sum+accounts[customer][bank];
            }
            if(sum>max)
                max=sum;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[][] accounts = new int[3][2];
        System.out.println("Enter each customers bank wealth");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                accounts[i][j] = in.nextInt();
            }
        }
            for(int[] a: accounts)
                System.out.println(Arrays.toString(a));

            System.out.println("Maximum wealth= "+ maximumWealth(accounts));
        }
}
