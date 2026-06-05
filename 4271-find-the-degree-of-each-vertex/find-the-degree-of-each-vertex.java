class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] res=new int [matrix.length];
        for(int i=0;i<matrix.length;i++){
            int c=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[j][i]==1)
                c++;
            }
            res[i]=c;
        }
        return res;
    }
}