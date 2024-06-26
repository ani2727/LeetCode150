//Problem Link: https://rb.gy/kqjurb

//code
class Solution 
{
    public int maxArea(int[] height) 
    {
        int maxWater = 0;
        int i = 0, j = height.length-1;

        while(i < j) {
            int water = (j-i)*(Math.min(height[i],height[j]));

            maxWater = Math.max(water,maxWater);
            if(height[i] < height[j]) i ++;
            else j --;
        }

        return maxWater;
    }
}
