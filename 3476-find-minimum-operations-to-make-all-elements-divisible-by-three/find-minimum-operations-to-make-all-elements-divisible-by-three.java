class Solution {
    public int minimumOperations(int[] nums) {
        int operation=0;
        for(int i:nums){
            if(i%3!=0){
                operation++;
            }
        }
        return operation;
    }
}