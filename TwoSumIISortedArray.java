//Problem Link: https://rb.gy/9besqn

//code
class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int i = 0, j = numbers.length-1;
        int sum = 0;
        while(i < j) {
            sum = numbers[i]+numbers[j];
            if(sum == target) return new int[] {i+1,j+1};
            else if(sum < target) i ++;
            else j --;
        }    
        return new int[] {-1};
    }
}
