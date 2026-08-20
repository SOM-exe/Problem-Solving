class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i = 2; i<=nums.length-1; i++){
            if(arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)){
                arr1.add(nums[i]);
            } else arr2.add(nums[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();

         for (int x : arr1) {
            list.add(x);
        }

         for (int x : arr2) {
            list.add(x);
        }
        int res[] = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}