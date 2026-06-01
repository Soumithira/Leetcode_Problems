class Solution {
    public int maxProductDifference(int[] nums) {
        int m1=Integer.MIN_VALUE,m2=Integer.MIN_VALUE,s1=Integer.MAX_VALUE,s2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>m1){
            m2=m1;
            m1=nums[i];}
            else if(nums[i]>m2)
            m2=nums[i];
            if(nums[i]<s1){
                s2=s1;
                s1=nums[i];
            }
            else if(nums[i]<s2)
            s2=nums[i];
        }
        return ((m1*m2)-(s1*s2));

    }
}