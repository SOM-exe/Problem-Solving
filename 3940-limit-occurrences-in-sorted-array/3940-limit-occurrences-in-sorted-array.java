class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i : nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i) > k){
                map.put(i , k);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : map.keySet()){
            int cnt = map.get(i);
            while(cnt > 0){
                list.add(i);
                cnt--;
            }
        }

        int ans[] = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}