class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList <Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(!((nums[i]+1)==nums[i+1])){
            int n=nums[i]+1;
            while(n<nums[i+1]){
            res.add(n++);}}
        }
        return res;
    }
}