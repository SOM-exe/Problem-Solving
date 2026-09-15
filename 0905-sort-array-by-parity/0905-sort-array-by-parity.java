class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int[] ans = new int[nums.length];
        for(int num : nums){
            if(num % 2 == 0){
                l.add(num);
            }
        }
        for(int num : nums){
            if(num % 2 != 0){
                l.add(num);
            }
        }
        for(int i = 0; i<l.size(); i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}