class Solution {

    public int findMaxK(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        int k = Integer.MIN_VALUE;
        
        for(int i : list){
            if(list.contains(-1*i)){
            k = Math.max(k , i);
           } 
        }
        return k == Integer.MIN_VALUE ? -1 : Math.abs(k);
    }
}