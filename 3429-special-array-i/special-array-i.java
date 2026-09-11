class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean flag=true;
        if(nums.length==1){
            return true;
        }
        for(int i=1;i<nums.length;i++){
            if((nums[i-1]%2==0&&nums[i]%2==0)||(nums[i-1]%2!=0&&nums[i]%2!=0)){
                flag=false;
            }
        }
        return flag;
    }
}