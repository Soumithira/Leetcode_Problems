class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int e=0;
        while((numbers[e]>=0 && numbers[e]<=target) || numbers[e]<0){
            for(int j=e+1;j<numbers.length;j++){
                if(numbers[e]+numbers[j]==target)
                return new int[]{e+1,j+1};
                else if(numbers[e]+numbers[j]>target)
                break;
            }
            e++;
        }
        return new int[]{};
    }
}