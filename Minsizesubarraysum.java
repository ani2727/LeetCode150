//Problem Link: https://rb.gy/vefdvb

//code
class Solution 
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        int n = nums.length;
        int sum = 0, min_length = Integer.MAX_VALUE;
        int i = 0, j = 0;
        
        while (j < n) 
        {
            sum += nums[j];
            
            while (sum >= target) 
            {
                min_length = Math.min(min_length, j - i + 1);
                sum -= nums[i];
                i++;
            }
            
            j++;
        }
        
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}
