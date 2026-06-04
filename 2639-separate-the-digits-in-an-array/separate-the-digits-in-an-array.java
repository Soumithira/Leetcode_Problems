class Solution {
    public int[] separateDigits(int[] nums) {
       ArrayList <Character> l=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        String s=Integer.toString(nums[i]);
        for(int j=0;j<s.length();j++){
            l.add(s.charAt(j));
        }
       }
       int res[]=new int[l.size()];
       int e=0;
       for(char a:l){
        res[e++]=a-'0';
       }
       return res;
    }
}