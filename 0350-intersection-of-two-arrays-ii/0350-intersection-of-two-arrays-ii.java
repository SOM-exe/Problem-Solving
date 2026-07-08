class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map0 = new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i =0; i<nums1.length; i++){
           map.put(Integer.valueOf(nums1[i]) , map.getOrDefault(nums1[i],0)+1);
        }
        for(int i =0; i<nums2.length; i++){
           map0.put(Integer.valueOf(nums2[i]) , map0.getOrDefault(nums2[i],0)+1);
        }
        for(int i =0; i<nums2.length; i++){
           set.add(nums2[i]);
        }
        for(int i : set){
            if(map.containsKey(i)){
            int minv = Integer.valueOf(Math.min(map.get(i), map0.get(i)));
              while(minv > 0){
                list.add(i);
                minv--;
              }
           }
        }

        int arr[] = new int[list.size()];
        int i=0;
        for(int nums : list){
            arr[i++] = nums;
        }
    return arr;
    }
}