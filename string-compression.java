class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if(chars.length == 1)
            return 1;
        while(i < chars.length)
        {
            int count = 0;
            char curr = chars[i];
            while(i < chars.length && chars[i] == curr)
            {
                i++;
                count++;
            }
            sb.append(curr);
            if(count > 1)
                sb.append(count);
        }
        for(int j=0;j<sb.length();j++)
            chars[j] = sb.charAt(j);
        return sb.length();
    }
}
