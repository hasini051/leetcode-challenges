class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int s=nums.length,e=0;
        int b[]=nums.clone();
        Arrays.sort(b);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=b[i]){
                s=Math.min(s,i);
                e=Math.max(e,i);
            }
        }
       if(e-s>=0)
       return e-s+1;
       else
       return 0;
    }
}