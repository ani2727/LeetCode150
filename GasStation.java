//Problem Link: https://rb.gy/nv5xi8

//code
class Solution 
{
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int n = gas.length;

        int total_surplus = 0;
        int surplus = 0;
        int startIndex = 0;

        for(int i = 0 ; i < n ; i ++) {
            total_surplus += gas[i]-cost[i];

            surplus += gas[i]-cost[i];
            if(surplus < 0) {
                surplus = 0;
                startIndex = i+1;
            }
        }   

        return total_surplus >= 0 ? startIndex : -1;
    }
}
