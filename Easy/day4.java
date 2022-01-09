//Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
//question link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class day4 {
    public static void main(String[] args) {
        char[] letters1={'a','v','y'};
        char target1='t';
        char ans1=nextGreatestLetter(letters1,target1);
        System.out.println(letters1);
        System.out.println(target1);
        System.out.println(ans1);
        char[] letters2={'d','h','u'};
        char target2='z';
        char ans2=nextGreatestLetter(letters2,target2);
        System.out.println(letters2);
        System.out.println(target2);
        System.out.println(ans2);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
