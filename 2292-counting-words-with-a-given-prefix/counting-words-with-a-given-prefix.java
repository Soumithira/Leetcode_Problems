class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=pref.length();
        int c=0;
        for(int i=0;i<words.length;i++){
            if(pref.charAt(0)==words[i].charAt(0)){
                boolean f=false;
                for(int j=0,e=0;j<n;j++,e++){
                    if(e<words[i].length() && pref.charAt(j)==words[i].charAt(e)){
                        f=true;
                    }
                    else{
                    f=false;
                    break;}
                }
                if(f)
                c++;
            }
        }
        return c;
    }
}