class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            if(i % 2 != 0){
                l1.add(nums[i]);
            } else{
                l2.add(nums[i]);
            }
        }
        Collections.sort(l1, Collections.reverseOrder());
        Collections.sort(l2);

        int[] ans = new int[nums.length];
        int i = 0;
        int j = 1;
        int k = 0;
        int p = 0;

        while (i < nums.length) {
            ans[i] = l2.get(k);
            i += 2;
            k++;
        }

        while (j < nums.length) {
            ans[j] = l1.get(p);
            j += 2;
            p++;
        }
        return ans;
    }
}