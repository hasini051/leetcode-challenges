class Solution {
    public int minMoves(int[] nums) {
        int m=nums[0];
        int s=0;
        for(int x:nums){
           m=Math.min(m,x);
           s+=x;
        }
        return s-nums.length*m;
    }
}