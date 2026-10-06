class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int low1=nums[0];
        int high1=nums[1];
        int low2=nums[n-1];
        int high2=nums[n-2];

        return (low2*high2)-(low1*high1);
    }
}