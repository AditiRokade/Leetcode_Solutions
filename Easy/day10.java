import java.util.*;
public class day10 {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int k=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i%2==0)
                arr[i]=nums[k];
            else{
                arr[i]=nums[n+k];
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        int[] nums= new int[2*n];
        System.out.println("Enter elements");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

}
