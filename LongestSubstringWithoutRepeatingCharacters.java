//Problem Link: https://rb.gy/2ww3yn

//code
class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int start = 0;
        int end = 0;
        int max_len = 0;
        HashSet<Character> set = new HashSet<>();
        while(start < s.length()) {
            if(!set.contains(s.charAt(start))) {
                set.add(s.charAt(start));
                max_len = Math.max(max_len,start-end+1);
                start ++;
            }
            else {
                set.remove(s.charAt(end));
                end ++;
            }
        }

        return max_len;    
    }
}
