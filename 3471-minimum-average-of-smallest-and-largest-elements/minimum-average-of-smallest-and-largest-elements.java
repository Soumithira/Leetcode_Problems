class Solution {
    public double minimumAverage(int[] nums) {
     double min=Double.MAX_VALUE;
     Arrays.sort(nums);
     int i=0;
     int j=nums.length-1;
     while(i<j &&i< nums.length &&j>=0){
        double avg=(nums[i]+nums[j])/2.0;
        if(avg<min)
        min=avg;
        i++;
        j--;
     }
     return min;
    }
}