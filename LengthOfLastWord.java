//Problem Link: https://rb.gy/ia856j

//code
class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int len = 0;
        for(int i = s.length()-1 ; i >= 0 ; i --) {
            if(s.charAt(i) == ' ' && len == 0) continue;
            else if(s.charAt(i) == ' ') return len;
            else len ++;
        }    
        return len;
    }
}
