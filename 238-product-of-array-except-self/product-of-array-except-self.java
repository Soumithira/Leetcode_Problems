class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]res=new int[nums.length];
        int prv=1;
        for(int i=0;i<nums.length;i++){
            res[i]=prv;
            prv*=nums[i];
        }
        int suf=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=suf;
            suf*=nums[i];
        }
        return res;
    }
}