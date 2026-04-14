class Solution {
    public int missingNumber(int[] nums) {
        boolean fl=false;
        for(int i=0;i<=nums.length;i++){
            fl=false;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                fl=true;
                break;}
            }
            if(!fl)
            return i;
        }
        return 0;

    }
}