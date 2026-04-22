class Solution {
    public boolean isPalindrome(int x) {
        int res=0,t=x;
        if(x<0)
        return false;
        while(x>0){
            int r=x%10;
            res*=10;
            res+=r;
            x/=10;
        }
        if(t==res)
        return true;
        return false;
    }
}