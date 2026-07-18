class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }

        HashMap<Character, Integer> hm1 = new HashMap<>();
        for(char ch : target.toCharArray()){
            hm1.put(ch, hm1.getOrDefault(ch,0)+1);
        }

        int minv = Integer.MAX_VALUE;
        for(char ch : target.toCharArray()){
            
            minv = Math.min(minv , hm.getOrDefault(ch,0)/hm1.get(ch));
        }
        return minv;
    }
}