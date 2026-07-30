class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {

        boolean[] covered = new boolean[101];

        for (int i = 0; i < nums.size(); i++) {

            int start = nums.get(i).get(0);
            int end = nums.get(i).get(1);

            for (int point = start; point <= end; point++) {
                covered[point] = true;
            }
        }

        int count = 0;

        for (int point = 1; point <= 100; point++) {
            if (covered[point] == true) {
                count++;
            }
        }

        return count;
    }
}