class Solution {
    public boolean validDigit(int n, int x) {
        String strx=String.valueOf(x);
        String strn=String.valueOf(n);
        String[] str=strn.split("");
        if(str[0].equals(strx))
            return false;
        for(int i=1;i<str.length;i++){
            if(str[i].equals(strx))
                return true;
        }
        return false;
    }
}