//Approach: Normal Counting using For Loop
//Time complexity:O(n)
//Space complexity:O(1)

class Solution {
public:
    bool isThree(int n) {
        if (n <= 0)
            return false;
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                count++;
        return count == 3 ? true : false;
    }
};