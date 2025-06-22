//Approach : Loop from 1 to n, add numbers divisible by 3, 5, or 7 to the sum.
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            //Check if no in between (aka value of i) is divisible by 3,5,7 or not 
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                sum = sum + (i);
        }
        return sum;
    }
}