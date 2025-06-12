//Approach: Half Reversal - We reverse only half numbers
//Time Complexity: O(log₁₀ n) : We reverse only half of the digits in the number.
//Space Complexity: O(1): No extra space is used except a few integer variables.
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            // Negative no && Numbers ending in 0 (like 10) can't be palindromes unless the number is 0 itself.
            return false;
        int rev = 0;
        while (x > rev) {
            rev = (rev * 10) + (x % 10); // Add the last digit of x to rev
            x = x / 10; //remove last digit
        }
        return (x == rev || x == rev / 10); // Check for both even and odd digit counts

    }
}