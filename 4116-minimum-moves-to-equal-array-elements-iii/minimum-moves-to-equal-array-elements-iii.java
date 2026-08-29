class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length-1;i++){
            result+=Math.abs(nums[i]-nums[nums.length-1]);
        }
        return result;
    }
}