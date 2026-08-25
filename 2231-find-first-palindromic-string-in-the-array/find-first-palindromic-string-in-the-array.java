class Solution {
    public String firstPalindrome(String[] words) {
        String result="";
        for(String s:words){
            StringBuilder str=new StringBuilder(s).reverse();
            if(s.equals(str.toString())){
                return s;
            }
        }
        return "";
    }
}