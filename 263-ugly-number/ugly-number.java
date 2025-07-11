/*
Approach : Repeatedly divide n by 2, 3, and 5; if the result is 1, it’s an ugly number.
Time Complexity: O(logn)
Space Complexity is O(1)
*/

class Solution {
    public boolean isUgly(int n) {
        if (n <= 0)
            return false;

        while (n % 2 == 0)
            n /= 2;
        while (n % 3 == 0)
            n /= 3;
        while (n % 5 == 0)
            n /= 5;

        return n==1;
    }
}