class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        int cRow = 0;
        boolean goingDown = true;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            rows.get(cRow).append(ch);

            if (cRow == numRows - 1) {
                goingDown = false;
            } else if (cRow == 0) {
                goingDown = true;
            }

            if (goingDown) {
                cRow++;
            } else {
                cRow--;
            }
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder ns : rows) {
            res.append(ns);
        }

        return res.toString();
    }
}