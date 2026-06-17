class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        ArrayList <Integer> l=new ArrayList<>();
        int c=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
            c++;
            else{
                if(l.contains(c))
                return false;
                else{
                    l.add(c);
                    c=1;
                }
            }
        }
        if(l.contains(c))
        return false;
        return true;
    }
}