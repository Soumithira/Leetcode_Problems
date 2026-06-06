class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<>();

        Arrays.sort(nums);
        int m=0,c=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            c++;
            else{
                if(c>m)
                m=c;
                c=1;
            }
        }
        if(c>m)
        m=c;

        System.out.print(m);
        boolean[]v=new boolean[nums.length];
        while(m>0){
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!l.contains(nums[i])&& !v[i]){
            l.add(nums[i]);
            v[i]=true;}
        }
        res.add(l);
        m--;}
        return res;
    }
}