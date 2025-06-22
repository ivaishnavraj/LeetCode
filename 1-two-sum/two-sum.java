//Approach : Brute Force Code
//Time Complexity: O(n²)
//Space Complexity: O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Go through each number in the array using index i
        for (int i = 0; i < nums.length- 1; i++) {
            //For each number, look at the numbers that come after it using another index j
            for (int j = i + 1; j < nums.length; j++) 
                if (nums[i] + nums[j] == target) //Check if nums[i] + nums[j] == target.
                { 
                    return new int[] { i, j }; //If TRUE, return their positions (i and j)
                }
        }
        return null;//If FALSE , return null
    }
}