class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int m1=nums1[0],m2=nums2[0];
        for(int i=1;i<nums1.length;i++){
            if(nums1[i]<m1)
            m1=nums1[i];
            if(nums2[i]<m2)
            m2=nums2[i];
        }
        return m2-m1;
    }
}