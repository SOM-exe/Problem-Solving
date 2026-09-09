class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;

        for(int[] i : tasks){
            int sum = 0;
            for(int j : i){
                sum = sum +j;
            }
            min = Math.min(min , sum);
        }
        return min;
    }
}