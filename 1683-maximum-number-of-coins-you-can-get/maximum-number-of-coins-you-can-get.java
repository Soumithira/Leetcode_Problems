class Solution {
    public int maxCoins(int[] piles) {
        int i=piles.length/3,s=0;
        Arrays.sort(piles);
        for(int j=i;j<piles.length-1;j+=2){
            s+=piles[j];
        }
        return s;
    }
}