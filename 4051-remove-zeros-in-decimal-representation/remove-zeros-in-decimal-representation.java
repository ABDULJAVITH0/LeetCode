class Solution {
    public long removeZeros(long n) {
        String s=String.valueOf(n);
        s=s.replace("0","");
        long result=Long.valueOf(s);
        return result;
    }
}