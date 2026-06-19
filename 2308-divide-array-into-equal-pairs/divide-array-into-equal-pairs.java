class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            c++;
            else{
                if(c%2!=0)
                return false;
                c=1;
            }
        }
        return true;
    }
}