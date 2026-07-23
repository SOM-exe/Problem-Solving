class Solution {

    public String c2b(int n){
        if (n == 0) {
            return "0";
        }

        String res = "";

        while (n > 0) {
            if (n % 2 == 1) {
                res += '1';
            } else {
                res += '0';
            }

            n = n / 2;
        }

        return res;
    }
    public int[] sortByBits(int[] arr) {
        
 HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

        
        for (int num : arr) {

            String s = c2b(num);

            int count = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '1') {
                    count++;
                }
            }

            if (!hm.containsKey(count)) {
                hm.put(count, new ArrayList<>());
            }

            hm.get(count).add(num);
        }

               for (ArrayList<Integer> list : hm.values()) {
            Collections.sort(list);
        }

        int index = 0;

        for (int i = 0; i <= 32; i++) {

            if (hm.containsKey(i)) {

                ArrayList<Integer> list = hm.get(i);

                for (int num : list) {
                    arr[index] = num;
                    index++;
                }
            }
        }

        return arr;
    }
}