class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double cs=0,ms;
        for(int i=0;i<k;i++){
           cs+= nums[i];
        }
       ms=cs;
        for(int i=k;i<nums.length;i++){
            cs+=nums[i]-nums[i-k];
            ms=Math.max(cs,ms);
        }
        return ms/k;
    }
}