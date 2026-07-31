class Solution {
    public int countDays(int days, int[][] meetings) {

        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        ans.add(meetings[0]);

        int n = meetings.length;

       
        for(int i = 1; i < n; i++){

            int[] prev = ans.get(ans.size() - 1);
            int[] curr = meetings[i];

            if(prev[1] >= curr[0]){
                prev[1] = Math.max(prev[1], curr[1]);
            }
            else{
                ans.add(curr);
            }
        }

        int sum = 0;

        for(int i = 0; i < ans.size(); i++){

            int[] curr = ans.get(i);

            sum += curr[1] - curr[0] + 1;
        }

        
        return days - sum;
    }
}