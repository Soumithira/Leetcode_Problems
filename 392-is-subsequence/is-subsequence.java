class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i=0;i<s.length();i++){
            boolean f=false;
            while(j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    f=true;
                    j++;
                    break;
                }
                j++;
            }
            if(!f)
            return false;
        }
        return true;
    }
}