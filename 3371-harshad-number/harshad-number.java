class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num=0;
        int n=x;
        while(n>0){
            num+=n%10;
            n/=10;
        }
        if(x%num==0)
            return num;
        else
            return -1;
    }
}