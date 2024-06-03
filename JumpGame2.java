//Problem Link: https://rb.gy/b3rm85

//code
class Solution 
{
    public int jump(int[] nums) 
    {
        int n = nums.length;

        int jumps = 0;
        int maxReach = 0;
        int currReach = 0; 

        for (int i = 0; i < n - 1; i++) 
        {
            maxReach = Math.max(maxReach, i + nums[i]);

            if (i == currReach) 
            {
                jumps++;
                currReach = maxReach;

                if (maxReach >= n - 1) break;
            }
        }
        return jumps;
    }
}
