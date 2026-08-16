class Solution {
    public boolean areNumbersAscending(String s) {
        ArrayList<Integer> list = new ArrayList<>();

        String[] words = s.split(" ");

        for (String word : words) {
            if (Character.isDigit(word.charAt(0))) {
                list.add(Integer.parseInt(word));
            }
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) >= list.get(i)) {
                return false;
            }
        }

        return true;
    }
}