//Given a non-negative integer x, compute and return the square root of x.
//Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
//question link: https://leetcode.com/problems/sqrtx/
import java.util.Scanner;
public class day2 {
    public static void main(String[] args){
        
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if (x == 0 || x == 1)   
            return x;

        int start = 1, end = x/2, sqrt = 0;  
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid)     
                return mid;

            else if (mid < x/mid)  
            {
                sqrt = mid;         //either the middle element is the possible answer, or
                start = mid + 1;    //the answer lies in the second half
            }
            else
                end = mid - 1;     
        }
        return sqrt;
    }
        
    }

