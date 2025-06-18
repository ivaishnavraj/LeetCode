//Approach 2: If Digit is Single Just Return else do normal digit seperation and add that
//Time Complexity: O(1)
//Space Complexity: O(1)

class Solution {
    public int addDigits(int num) {
        while(num>9)
        {
            int rem = num%10;
            int fnum = num/10;
            num = fnum + rem;
        }
        return num;
    }
}