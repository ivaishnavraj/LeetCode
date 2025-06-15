// APPROACH : Try all powers of 2 from 2^0 to 2^31 (because 2^31 > Integer.MAX_VALUE)
// Dont Use Math.pow(2, i) instead use if (n == (1 << i))
// Time Complexity : O(1)
// Space Complexity : O(1)

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1)
            return false;
        for (int i = 0; i <= 31; i++) {
            //if(n==(int) Math.pow(2,i))  
            //❌works fine for most small values, but it's still not 100% safe due to         
            //potential floating-point rounding issues at higher powers of 2

            if (n == (1 << i)) //✅✅ Use integer bit shifting instead of Math.pow()

            {
                return true;
            }
        }
        return false;
    }
}