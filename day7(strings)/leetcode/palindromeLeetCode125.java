class Solution {
    public boolean isPalindrome(String s) {
        int c=0;
        String cp="";
        String d=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char m=d.charAt(i);
            if((m>='a'&&m<='z')||(m>='0'&&m<='9'))
            {
                cp+=m;
            }
        }
        String r=new StringBuffer(cp).reverse().toString();
        if(cp.equals(r)||cp.equals(""))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}