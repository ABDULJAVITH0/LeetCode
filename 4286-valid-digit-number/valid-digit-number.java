class Solution {
    public boolean validDigit(int n, int x) {
        String strn=String.valueOf(n);
        char digit=(char)(x+'0');

        if(strn.charAt(0)==digit)
            return false;

        return strn.indexOf(digit,1)!=-1;
    }
}