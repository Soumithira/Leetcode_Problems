class Solution {
    public int minimumSum(int num) {
        int[]d=new int[4];
        int e=0;
        while(num>0){
        d[e++]=num%10;
        num/=10;}
        Arrays.sort(d);
        return (d[0]*10+d[3])+(d[1]*10+d[2]);
    }
}