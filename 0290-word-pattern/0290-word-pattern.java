class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] letter = pattern.toCharArray();

        if (words.length != letter.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();

        int i = 0;
        while (i < words.length) {

            if (map.containsKey(letter[i])) {
                if (!map.get(letter[i]).equals(words[i])) {
                    return false;
                }
            } else {

                if (map.containsValue(words[i])) {
                    return false;
                }
                map.put(letter[i], words[i]);
            }

            i++;
        }

        return true;
    }
}