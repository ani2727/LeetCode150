//Problem Link: https://rb.gy/ee616f

//code
class Solution 
{
    public int hIndex(int[] citations) 
    {
        int n = citations.length;
        Arrays.sort(citations);
        int ct = 1;
        for(int i = n-1 ; i >= 0; i --) {
            if(citations[i] >= ct) ct ++;
            else break;
        }

        return --ct;
    }
}
