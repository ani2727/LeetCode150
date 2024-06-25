//Problem Link: https://rb.gy/sy0ft0

//code
class Solution 
{
    public boolean isSubsequence(String s, String t) 
    {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            
            j = t.indexOf(s.charAt(i), j);
            if (j == -1) return false;
            j++;
        }
        return true;
    }
}
