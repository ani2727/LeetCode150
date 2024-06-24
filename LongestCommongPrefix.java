//Problem Link: https://rb.gy/i37e73

//code
class Solution 
{
    public String longestCommonPrefix(String[] str) 
    {
        Arrays.sort(str);
        int n = str.length;

        char first[] = str[0].toCharArray();
        char last[] = str[n-1].toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < first.length ; i ++ ){
            if(first[i] == last[i]) sb.append(first[i]);
            else break;;
        }
        return sb.toString();

    }
}
