class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] s = startTime.split(":");
        String[] s1 = endTime.split(":");

        int start =
                Integer.parseInt(s[0]) * 3600 +
                Integer.parseInt(s[1]) * 60 +
                Integer.parseInt(s[2]);
        int end =
                Integer.parseInt(s1[0]) * 3600 +
                Integer.parseInt(s1[1]) * 60 +
                Integer.parseInt(s1[2]);
        return Math.abs(start-end);
    }
}