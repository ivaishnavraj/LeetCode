//Approach : Iterating through each elements and checking for odds.
//Time complexity: O(n)
//Space complexity: O(1)

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
            for (int i = 0; i < arr.length-2 ; i++) {
                // Check if current, next, and next-to-next numbers are all odd
                if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                    return true; // 3 consecutive odds found in row
                }
            }
            return false; // No 3 consecutive odds found
    }
}