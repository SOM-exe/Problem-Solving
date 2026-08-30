class Solution {
    public int ans(int i){
        String s = "";
        while(i>0){
            int ld = i%10;
            s += ld;
            i = i/10;
        }
        return Integer.parseInt(s);
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        
        for(int i : nums){
            if(i>0 && i<=9){
                continue;
            }
            int num = ans(i);
            if(!set.contains(num)){
                set.add(num);
            }
        }
        return set.size();
    }
}