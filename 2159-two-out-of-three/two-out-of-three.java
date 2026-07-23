class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> l=new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]&& (!l.contains(nums1[i])))
                l.add(nums1[i]);
            }
        }

        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums3.length;j++){
                if(nums2[i]==nums3[j] && (!l.contains(nums2[i])))
                l.add(nums2[i]);
            }
        }

        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums3[i]==nums1[j]&& (!l.contains(nums3[i])))
                l.add(nums3[i]);
            }
        }
        return l;
    }
}