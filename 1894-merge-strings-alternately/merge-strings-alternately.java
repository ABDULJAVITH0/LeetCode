class Solution {
    public String mergeAlternately(String word1, String word2) {
      int length=Math.min(word1.length(),word2.length());
      String str="";
      for(int i=0;i<length;i++){
        str+=word1.charAt(i);
        str+=word2.charAt(i);
      }
      str+=word1.substring(length);
      str+=word2.substring(length);
      return str;
    }
}