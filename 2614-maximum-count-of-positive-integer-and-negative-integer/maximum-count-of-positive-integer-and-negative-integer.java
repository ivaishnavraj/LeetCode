//Approach : Loop through the array, count positives and negatives, and return the larger count.
//Time complexity: O(n)
//Space complexity: O(1)

class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0; int neg = 0;
        for (int dig : nums) {
            if (dig < 0)
                neg++;
            if (dig > 0)
                pos++;
        }
             return Math.max(pos , neg);
    }
}