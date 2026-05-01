class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st=-1,en=-1,i=0;
        while(i<nums.length){
            if(nums[i]>target)
            return new int []{st,en};
            if(nums[i]<target)
            i++;
            else if(nums[i]==target){
                st=i;
                break;
            }
        }
        while(i<nums.length && nums[i]==target){
            i++;
            en=i-1;
        }
        return new int[] {st,en};
    }
}