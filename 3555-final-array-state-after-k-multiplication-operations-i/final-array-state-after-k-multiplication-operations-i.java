class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        while(k-->0){
            int minInd=0;
            for(int i=1;i<nums.length;i++){
                if(nums[minInd]>nums[i]){
                    minInd=i;
                }
            }
            nums[minInd]*=multiplier;
        }
        return nums;
    }
}