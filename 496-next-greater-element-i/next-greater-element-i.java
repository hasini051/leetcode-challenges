class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int c=0,j=0;
            for(j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    break;
                }
            }
            for(int k=j+1;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    c++;
                    a[i]=nums2[k];
                    break;
                }
            }
            if(c==0)
            a[i]=-1;
        }
        return a;
    }
}