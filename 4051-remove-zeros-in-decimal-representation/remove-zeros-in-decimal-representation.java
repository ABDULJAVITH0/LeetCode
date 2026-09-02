class Solution {
    public long removeZeros(long n) {
        long result=0;
        long multiple=1;
        while(n>0){
            long digit=n%10;
            if(digit!=0){
                result+=digit*multiple;
                multiple*=10;
            }
            n/=10;
        }
        return result;
    }
}