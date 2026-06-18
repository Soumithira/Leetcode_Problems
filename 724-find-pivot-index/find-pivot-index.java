class Solution {
    public int pivotIndex(int[] nums) {
        int[] lef=new int[nums.length];
        int[] rig=new int[nums.length];
        int prv=0;
        for(int i=0;i<nums.length;i++){
            lef[i]=prv;
            prv+=nums[i];
        }
        int nx=0;
        for(int i=nums.length-1;i>=0;i--){
            rig[i]=nx;
            nx+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(lef[i]==rig[i])
            return i;
        }
        return -1;
    }
}