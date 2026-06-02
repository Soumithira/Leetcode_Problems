class Solution {
    public int[] plusOne(int[] digits) {
        int c=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i]==9)
            c++;
        }
        int l=digits.length;
        if(c==digits.length)
        l+=1;
        int[] res=new int[l];
        int i=res.length-1,cr=0;
        if(digits[digits.length-1]==9){
            cr=1;
            res[i--]=0;
        }
        else
        res[i--]=digits[digits.length-1]+1;
        for(int j=digits.length-2;j>=0;j--){
            if(digits[j]+cr==10){
                cr=1;
                res[i--]=0;
            }
            else{
                res[i--]=digits[j]+cr;
                cr=0;
            }
        }
        if(cr==1)
        res[i--]=1;
        return res;
    }
}