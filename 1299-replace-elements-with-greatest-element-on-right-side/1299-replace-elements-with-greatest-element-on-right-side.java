class Solution {
    public int[] replaceElements(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        for(int i = arr.length-2; i>=0; i--){
            int mx = Integer.MIN_VALUE;
            for(int j = i+1; j<arr.length; j++){
                mx = Math.max(mx , arr[j]);
            }
            list.add(mx);
        }
        Collections.reverse(list);

        int[] ans = new int[arr.length];
        for(int i = 0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}