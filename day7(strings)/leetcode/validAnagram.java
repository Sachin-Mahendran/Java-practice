import java.util.Arrays;
    class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=s.length();
            char ch[]=s.toCharArray();
            char th[]=t.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(th);
            if(n!=m)
            {
                return false;
            }
            return Arrays.equals(ch,th);
    }
}
