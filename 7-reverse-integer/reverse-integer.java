class Solution {
    public int reverse(int x) {
        int t=x;
        x=Math.abs(x);
        long res=0;
        while(x>0){
            res*=10;
            int r=x%10;
            res+=r;
            x/=10;
        }
        if(res>Integer.MAX_VALUE)
        return 0;
        if(t<0)
        return (int)-res;
        return (int)res;
    }
}