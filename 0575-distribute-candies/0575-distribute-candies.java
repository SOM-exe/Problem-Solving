class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : candyType){
            set.add(i);
        }
        int type = set.size();
        int docAdvice = candyType.length/2;

        if(type >= docAdvice){
            return docAdvice;
        }
        return type;
    }
}