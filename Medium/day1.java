//Find First and Last Position of Element in Sorted Array
//question link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class day1 {
    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        int target=8;
        System.out.println(nums);
        System.out.println(target);
        System.out.println(Arrays.toString(searchRange(nums,target)));    
    }

    public static int[] searchRange(int[] nums, int target) 
    {
        int[] ans = {-1,-1};
        ans[0]= search(nums, target, true);//starting position of target
        if(ans[0]!=-1)
        {
            ans[1]= search(nums, target, false);//last position of target
        }
        return ans;
    }
    public static int search(int[] nums, int target, boolean findStartIndex) 
    {
        int start = 0;
        int end = nums.length-1;
        int ans= -1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]>target)
            end= mid-1;
            else if(nums[mid]<target)
            start= mid+1;
            else
            {
                ans = mid;       
                if(findStartIndex)
                {
                    end= mid-1;
                }
                else
                start= mid+1;
            }
        }
            return ans;

        
    }
}

