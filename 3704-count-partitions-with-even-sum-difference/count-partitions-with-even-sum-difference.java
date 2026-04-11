class Solution {
    public int countPartitions(int[] nums) {
        int le=0,re=0,c=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<=i;j++){
                le+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                re+=nums[k];
            }
            if((le-re)%2==0)
            c++;
            le=0;
            re=0;
        }
        return c;
    }
}