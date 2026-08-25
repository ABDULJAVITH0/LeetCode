class Solution {
    public String firstPalindrome(String[] words) {
        String result="";
        for(String s:words){
            String str=new StringBuilder(s).reverse().toString();
            if(s.equals(str)){
                result=s;
                break;
            }
        }
        return result;
    }
}