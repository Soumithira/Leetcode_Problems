class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0,e=0;
        if(nums.length==1)
        return 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
            k++;
            nums[e++]=nums[i];}
        }
        if(nums.length-1>0){
            k++;
            nums[e++]=nums[nums.length-1];}
        return k;
    }
}