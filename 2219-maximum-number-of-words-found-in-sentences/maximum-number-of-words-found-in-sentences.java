class Solution {
    public int mostWordsFound(String[] sentences) {
        int mc=0;
        for(int i=0;i<sentences.length;i++){
            int c=0;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' ')
                c++;
            }
            if(c>mc)
            mc=c;
        }
        return mc+1;
    }
}