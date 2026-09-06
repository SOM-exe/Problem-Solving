class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
       HashMap<Integer, Integer> hm = new HashMap<>();
       for(int i : nums){
        hm.put(i , hm.getOrDefault(i,0)+1);
       } 
       int sum = 0;
       for(int i : hm.keySet()){
        if(hm.get(i) % k == 0){
            sum += (i*hm.get(i));
        }
       }
       return sum;
    }
}