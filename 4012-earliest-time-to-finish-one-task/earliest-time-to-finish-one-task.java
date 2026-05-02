class Solution {
    public int earliestTime(int[][] tasks) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            int s=0;
            for(int j=0;j<tasks[i].length;j++){
                s+=tasks[i][j];
            }
            if(s<min)
            min=s;
        }
        return min;
    }
}