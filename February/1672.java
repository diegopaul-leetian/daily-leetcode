package February;

/*1672. Richest Customer Wealth
 * February 8:00 PM
 * Second Problem of the day
 */

 class Solution{
    public static int maximumWealth(int[][] accounts){
        int maxWealthSoFar = 0;

        for (int[] customer: accounts){
            int currentCustomerWealth = 0;

            for (int bank: customer){
                currentCustomerWealth += bank;
            }
            
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }

        return maxWealthSoFar;
    }
    /*Time Complexity: O(n * m)
     *Space Complexity: O(1)
     */
 }