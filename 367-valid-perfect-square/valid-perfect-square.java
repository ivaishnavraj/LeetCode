// Approach: Linear Search check for perfect Square by Sqauring
//Time Complexity: O(root(n)) == Because we only iterate up to the square root of num
//Space Complexity: O(1)
class Solution {
    public boolean isPerfectSquare(int num) {
        long i;
        for (i = 1; i * i < num; i++)
            ;
        return i * i == num;

    }
}