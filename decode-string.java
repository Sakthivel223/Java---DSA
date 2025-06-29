class Solution {
    public String decodeString(String s) {
        Stack <Integer> num = new Stack<>();
        Stack <StringBuilder> ss = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c))
                n = n * 10 + (c - '0');
            else if(c == '[')
            {
                num.push(n);
                n = 0;
                ss.push(sb);
                sb = new StringBuilder();
            }
            else if(c == ']')
            {
                int rep = num.pop();
                StringBuilder temp = sb;
                sb = ss.pop();
                while(rep > 0)
                {
                    sb.append(temp);
                    rep--;
                }
            }
            else sb.append(c);
        }
        return sb.toString();
    }
}
