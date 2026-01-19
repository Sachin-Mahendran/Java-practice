import java.util.Arrays;
class Solution {
    public char findTheDifference(String s, String t) {
        char sc[]=s.toCharArray();
        char tc[]=t.toCharArray();
        int tl=tc.length;
         int sl=sc.length;
        Arrays.sort(sc);
        Arrays.sort(tc);
        for(int i=0;i<sl;i++)
        {if(sc[i]!=tc[i])
        return tc[i];
        }
        return tc[tl-1];
    }

}