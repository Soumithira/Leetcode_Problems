class Solution {
    public String truncateSentence(String s, int k) {
        String r="";
        int i=0;
        while(k>0 && i<s.length()){
            if(s.charAt(i)==' ')
            k--;
            if(k>0){
            r+=s.charAt(i);
            i++;}
        }
        return r;
    }
}