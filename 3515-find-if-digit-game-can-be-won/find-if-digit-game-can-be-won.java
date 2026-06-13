class Solution {
    public boolean canAliceWin(int[] nums) {
        int dd=0,sd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10)
            dd+=nums[i];
            else
            sd+=nums[i];
        }
        if(dd==sd)
        return false;
        return true;
    }
}