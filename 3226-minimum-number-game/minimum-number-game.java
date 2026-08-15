class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int temp=nums[i-1];
            nums[i-1]=nums[i];
            nums[i]=temp;
            i++;
        }
        return nums;
    }
}