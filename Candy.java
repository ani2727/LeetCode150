//Problem Link: https://rb.gy/zj18eb

//code
class Solution 
{
    public int candy(int[] ratings) 
    {
        int n = ratings.length;
        int leftMax[] = new int[n];
        leftMax[0] = 1;
        for(int i = 1 ; i < n ; i ++) {
            if(ratings[i] > ratings[i-1]) {
                leftMax[i] = leftMax[i-1]+1;
            }
            else leftMax[i] = 1;
        }   

        int rightMax[] = new int[n];
        rightMax[n-1] = 1;
        for(int i = n-2 ; i >= 0 ; i --) {
            if(ratings[i] > ratings[i+1]) {
                rightMax[i] = rightMax[i+1] + 1;
            }
            else rightMax[i] = 1;
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++) {
            ans += Math.max(leftMax[i],rightMax[i]);
        }

        return ans;
    }
}
