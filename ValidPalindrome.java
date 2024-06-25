//Problem Link: https://rb.gy/6vm7bh

//code
class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase();
        String str = "";
        for(int i = 0 ; i < s.length() ; i ++) {
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                str += s.charAt(i);
            }
        }    

        int i =  0,j = str.length()-1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i ++;
            j --;
        }

        return true;
    }
}
