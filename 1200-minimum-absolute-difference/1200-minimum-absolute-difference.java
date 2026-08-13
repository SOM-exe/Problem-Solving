class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> mainlist = new ArrayList<>();
        int minv = Integer.MAX_VALUE;
        for(int i = 1; i<arr.length; i++){
            int abs = Math.abs(arr[i]-arr[i-1]);
            minv = Math.min(minv , abs);

        }

        int a = 0;
        int b = 1;
        while(b<arr.length){
            List<Integer> list = new ArrayList<>();
            if((arr[b] - arr[a]) == minv){
                list.add(arr[a]);
                list.add(arr[b]);
                mainlist.add(list);
            }
            a++;
            b++;
        }
        return mainlist;
    }
}