package February;

/*1480. Running Sum of 1d Array
 * February 29, 2024 7:10 PM 
 * One of the first problem I encountered within this website
*/

class Solution{ 
    //first solution
    public int[] runningSum1(int[] nums){
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++){
            result[i] = nums[i] + result[i-1];
        }
        return result;
    }
    /*
     * time complexity = O(n)
     * space complexity = O(1)
     */

    //second solution 
    public int[] runningSum2(int[] nums){
        for (int i = 1; i < nums.length ; i++){
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}