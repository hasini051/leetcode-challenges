class Solution {
    public void rev(int[] nums, int s,int e){
        while(s<=e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s=s+1;
            e=e-1;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(nums.length<=1 || k==0)
        return;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
}