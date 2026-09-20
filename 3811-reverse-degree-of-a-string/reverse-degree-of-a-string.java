class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        for(int i=1;i<=n;i++){
            char ch=s.charAt(i-1);
            int dif=123-ch;
            sum+=dif*i;
        }
        return sum;

    }
}