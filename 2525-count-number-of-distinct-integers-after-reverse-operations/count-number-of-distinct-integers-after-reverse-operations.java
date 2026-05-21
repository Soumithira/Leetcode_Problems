class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet <Integer> rev=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            rev.add(n);
            int r=0;
            while(n>0){
                int rem=n%10;
                r=r*10+rem;
                n/=10;
            }
            rev.add(r);
        }
        return rev.size();
    }
}