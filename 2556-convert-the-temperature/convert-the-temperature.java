//Approach : Normally Calculate | Kelvin=Celsius+273.15 | Fahrenheit=Celsius∗(9/5)+32 and return the value
//Time complexity: O(1)
//Space complexity: O(1)

class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return ans;
    }

}