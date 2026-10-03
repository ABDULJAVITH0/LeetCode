class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]temp=new int[2*n];
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=i+n;j<=i+n;j++){
                temp[x++]=nums[i];
                temp[x++]=nums[j];
            }
        }
        return temp;
    }
}