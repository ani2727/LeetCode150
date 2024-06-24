//Problem Link: https://rb.gy/c98gtz

//code
class Solution 
{
    public String intToRoman(int num) 
    {
        StringBuilder sb = new StringBuilder();
        int intValue[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String roman[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for(int i = 0 ; i < intValue.length ; i ++) {
            while(num >= intValue[i]) {
                num -= intValue[i];
                sb.append(roman[i]);
            }
        }

        return sb.toString();
    }
}
