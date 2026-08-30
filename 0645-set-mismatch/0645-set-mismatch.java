class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            hm.put(i , hm.getOrDefault(i,0)+1);
        }
        
        for(int i : hm.keySet()){
            if(hm.get(i) == 2){
                list.add(i);
            }
        }
       for(int i = 1; i<=nums.length; i++){
        if(!hm.containsKey(i)){
            list.add(i);
        }
       }
       int[] ans = new int[list.size()];
       for(int i = 0; i<list.size(); i++){
        ans[i] = list.get(i);
       }
       return ans;
    }
}