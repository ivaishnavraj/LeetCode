//Approach: Use Digital root formula {result is always 1 + (num - 1) % 9}
//Time Complexity: O(1)
//Space Complexity: O(1)

class Solution {
    public int addDigits(int num) {
        if (num <= 0) return 0;
        // Digital root formula:
        return 1+(num-1)%9;       

        // For any positive integer, the repeated digit sum is: 1 + (num - 1) % 9
        // This gives the same result as adding digits repeatedly until one digit remains

}}