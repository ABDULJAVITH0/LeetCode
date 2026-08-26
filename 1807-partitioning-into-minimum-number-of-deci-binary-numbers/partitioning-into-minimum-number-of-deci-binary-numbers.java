class Solution {
    public int minPartitions(String n) {
     int maxdigit=0;
     for(char ch:n.toCharArray()){
        maxdigit=Math.max(maxdigit,ch-'0');
        if(maxdigit==9){
            break;
        }
     }
        return maxdigit;
    }
}