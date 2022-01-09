public class day2 {
    public static void main(String[] args) {
       int[] nums={1,2,1,3,5,6,4};//Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
       System.out.println(findPeakElement(nums)); 
    }
    public static int findPeakElement(int[] nums) {
        int start= 0;
        int end= nums.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[mid+1])    //You are in the decreasing part of the array
            {
                end=mid; //this may be the possible answer
            }
            else     //You are in the increasing part of the array
            {
                start= mid+1;  //because we know that the mid+1 element is greater than mid-element
            }
        }
        //In the end, start==end, will point to the peak value
        return start;
        
    }
    
}
