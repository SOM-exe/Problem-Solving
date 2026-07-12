class Solution {
    public String discountPrices(String sentence, int discount) {

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            String s = words[i];

            if (s.charAt(0) != '$' || s.length() == 1)
                continue;

            boolean valid = true;

            for (int j = 1; j < s.length(); j++) {
                if (!Character.isDigit(s.charAt(j))) {
                    valid = false;
                    break;
                }
            }

            if (!valid)
                continue;

            long price = Long.parseLong(s.substring(1));

            double newPrice = price * (100 - discount) / 100.0;

            words[i] = String.format("$%.2f", newPrice);
        }

        return String.join(" ", words);
    }
}