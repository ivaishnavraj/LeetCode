class Solution {
    public boolean isPowerOfFour(int n) {

        int count = 0;
        for (int x = 0; x <= 15; x++) {
            if (n == Math.pow(4, x)) {
                count++;
                break;
            }
        }
        if (count != 0)
            return true;
        else
            return false;
    }
}