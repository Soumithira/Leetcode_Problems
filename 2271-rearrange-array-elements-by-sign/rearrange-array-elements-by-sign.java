class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList <Integer> p=new ArrayList<>();
        ArrayList <Integer> n=new ArrayList<>();
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
            p.add(nums[i]);
            else
            n.add(nums[i]);
        }
        int e=0;
        for(int i=0;i<nums.length;i+=2){
            res[i]=p.get(e);
            res[i+1]=n.get(e++);
        }
        return res;

    }
}