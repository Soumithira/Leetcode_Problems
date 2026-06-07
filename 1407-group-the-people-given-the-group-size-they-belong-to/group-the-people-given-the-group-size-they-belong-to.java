class Solution {
    public List<List<Integer>> groupThePeople(int[] gs) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        boolean []vis=new boolean[gs.length];
        for(int i=0;i<gs.length;i++){
            if(!vis[i]){
            ArrayList<Integer> l=new ArrayList<>(gs[i]);
            l.add(i);
            vis[i]=true;
            for(int j=i+1;j<gs.length;j++){
                if(gs[i]==gs[j] && !vis[j] && gs[j]>l.size()){
                l.add(j);
                vis[j]=true;}

            }
            res.add(l);
        }
        }
        return res;

    }
}