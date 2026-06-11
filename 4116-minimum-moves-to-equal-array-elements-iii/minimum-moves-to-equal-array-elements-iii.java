class Solution {
    public int minMoves(int[] nums) {
        int m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m)
            m=nums[i];
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            c+=(m-nums[i]);
        }
        return c;
    }
}