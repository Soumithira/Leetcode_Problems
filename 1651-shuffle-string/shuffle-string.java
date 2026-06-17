class Solution {
    public String restoreString(String s, int[] indices) {
        int e=0;
        String r="";
        while(e<s.length()){
        for(int i=0;i<indices.length;i++){
            if(indices[i]==e){
                r+=s.charAt(i);
                e++;
                break;
            }
        }}
        return r;
    }
}