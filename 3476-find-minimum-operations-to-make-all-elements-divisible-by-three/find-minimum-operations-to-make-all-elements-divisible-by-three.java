class Solution {
    public int minimumOperations(int[] nums) {
        int operation=0;
        for(int i:nums){
          int rem=i%3;
          operation+=Math.min(rem,3-rem);
        }
        return operation;
    }
}