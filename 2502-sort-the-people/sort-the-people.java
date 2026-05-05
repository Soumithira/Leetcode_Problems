class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int j=0;j<heights.length-1;j++){
        int max=heights[j];
        int MI=j;
        for(int i=j+1;i<heights.length;i++){
            if(max<heights[i]){
                max=heights[i];
                MI=i;
            }
        }
        String t=names[MI];
        names[MI]=names[j];
        names[j]=t;
        int tem=heights[MI];
        heights[MI]=heights[j];
        heights[j]=tem;
        }
        return names;
    }
}