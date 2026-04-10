class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> dp=new ArrayList<>();
        for(int i=0;i<nums.length-1;i+=2){
            while(nums[i]>0){
                dp.add(nums[i+1]);
                nums[i]=nums[i]-1;
            }
        }
        int[]dl=new int[dp.size()];
        int e=0;
        for(int n:dp){
            dl[e++]=n;
        }
        return dl;
    }
}