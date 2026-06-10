class Solution {
    public boolean isFascinating(int n) {
        int num=n;
        List<Integer> l=new ArrayList<>();
        while(n>0){
            if(n%10==0)
            return false;
            l.add(n%10);
            n/=10;
        }
        n=num*2;
        while(n>0){
            if(n%10==0 ||l.contains(n%10))
            return false;
            else{
            l.add(n%10);
            n/=10;}
        }
        n=num*3;
         while(n>0){
            if(n%10==0 ||l.contains(n%10))
            return false;
            else{
            l.add(n%10);
            n/=10;}
        }
        return true;
    }
}