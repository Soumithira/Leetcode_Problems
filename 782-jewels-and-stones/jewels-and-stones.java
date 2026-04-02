class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        ArrayList<Character> j=new ArrayList<>();
        for(int i=0;i<jewels.length();i++){
            if(!j.contains(jewels.charAt(i)))
            j.add(jewels.charAt(i));
        }
        int c=0;
        for(int i=0;i<stones.length();i++){
            if(j.contains(stones.charAt(i)))
            c++;
        }
        return c;
    }
}