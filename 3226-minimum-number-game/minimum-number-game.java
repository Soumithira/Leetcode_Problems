class Solution {
    public int[] numberGame(int[] nums) {
    Arrays.sort(nums);
    int[] res=new int[nums.length];
    int e=0;
    for(int i=1;i<nums.length;i+=2){
        res[e++]=nums[i];
        res[e++]=nums[i-1];
    }
    return res;
    }
}