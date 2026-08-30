class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i , hm.getOrDefault(i,0)+1);
        }
        int ans = 0;
        for(int i : hm.keySet()){
            if(hm.get(i) == 2){
                ans = ans ^ i;
            }
        }
        return ans;
    }
}