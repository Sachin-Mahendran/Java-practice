//O(n(log n))
class Solution {
    public void reverseString(char[] s) {
        int l=s.length;
        int r=l-1,le=0;
        while(le<r)
        {
            char t=s[le];
            s[le]=s[r];
            s[r]=t;
            le++;
            r--;
        }
    }
        
}
//O(1)
/*class Solution {
    public void reverseString(char[] s) {
        int l=s.length;
        int r=l-1,le=0;
        while(le<r)
        {
            char t=s[le];
            s[le]=s[r];
            s[r]=t;
            le++;
            r--;
        }
    }
        
}
 */