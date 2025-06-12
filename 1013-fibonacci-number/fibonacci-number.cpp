// Approach 1: Simple Recursive Method  
// It keeps calling itself to calculate the numbers, but it ends up doing a lot of repeated work, which makes it slow.
// Time Complexity: O(2^n) : because the function calls itself twice each time, leading to a huge number of calls for large n.
// Space Complexity: O(n): because the maximum depth of recursion (how many times the function calls itself before returning) is n.

class Solution {
public:
    int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
};
