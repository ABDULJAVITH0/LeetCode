class Solution {
    public int hammingWeight(int n) {
        int count=0;
        String str[]=Integer.toBinaryString(n).split("");
        for(String s:str){
            if(s.equals("1")){
                count++;
            }
        }
        return count;
    }
}