class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int currentproduct=((nums[i]-1)*(nums[j]-1));
                if(max<currentproduct){
                    max=currentproduct;
                }
            }
        }
        return max;
    }
}