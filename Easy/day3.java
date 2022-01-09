import java.util.Scanner;
//Checking whether a number entered is perfect square or not
//question link: https://leetcode.com/problems/valid-perfect-square/
public class day3 {
    public static void main(String[] args){
        int num;
        System.out.println("Enter a number:");
        Scanner x=new Scanner(System.in);
        num=x.nextInt();
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int start=1;
        int end=num/2;
        int root=1;
        while(start<=end)
        {
            double mid=start+(end-start)/2;
            if(mid==num/mid) 
            {return true;}

            else if(mid<num/mid)
            {start=(int)mid+1;
             root=(int)mid;}

            else
            {end=(int)mid-1;}
        }
        if(root*root==num)          
        {return true;}

        else
        {return false;}
        
    }
}
