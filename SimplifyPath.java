//problem Link: https://rb.gy/nopl8z

//code
class Solution {
    public String simplifyPath(String path) {
        String str[] = path.split("/");
        Stack<String> st = new Stack<>();

        for(int i = 0 ; i < str.length ; i ++) {
            if(str[i].trim() != "") st.push(str[i]);
        }
        StringBuilder sb = new StringBuilder();
        int double_dots = 0;
        while(!st.isEmpty()) {
            String s = st.pop();
            if(s.equals("..")) {
                double_dots ++;
            }
            else if(!s.equals(".")) {
                if(double_dots == 0) sb.insert(0,"/" + s);
                else double_dots --;
            }
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
