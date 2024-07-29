//Problem Link: https://rb.gy/4di7ck

//code  - Tabulation without space
class Solution {
    
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        int prev = nums[0];
        int second_prev = 0;

        for(int i = 1 ; i < nums.length ; i ++) {
            int pick = nums[i];
            if(i > 1) pick += second_prev;
            int not_pick = prev;
            int curr = Math.max(pick,not_pick);
            second_prev = prev;
            prev = curr;
        }

        return prev;
    }
}

//Tabulation with space
class Solution {
    
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        dp[0] = nums[0];

        for(int i = 1 ; i < nums.length ; i ++) {
            int pick = nums[i];
            if(i > 1) pick += dp[i-2];
            int not_pick = dp[i-1];

            dp[i] = Math.max(pick,not_pick); 
        }

        return dp[nums.length-1];
    }
}

//Memorization
class Solution {
    public int solve(int ind, int nums[],int dp[]) {
        if(ind < 0) return 0;
        if(ind == 0) return nums[ind];
        if(dp[ind] != -1) return dp[ind];

        int pick = nums[ind] + solve(ind-2,nums,dp);
        int not_pick = solve(ind-1,nums,dp);

        return dp[ind] = Math.max(pick,not_pick);
    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return solve(nums.length-1, nums,dp);
    }
}
