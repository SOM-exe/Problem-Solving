class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> l = new ArrayList<>();

        for(int i : friends){
            l.add(i);
        }
        int[] ans = new int[friends.length];
        int j = 0;
        for(int i = 0; i<order.length; i++){
            if(l.contains(order[i]) && j < friends.length){
                ans[j++] = order[i];
            }
        }
        return ans;
    }
}