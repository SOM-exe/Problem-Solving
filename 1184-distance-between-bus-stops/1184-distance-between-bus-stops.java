class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int fans = 0;
        int n = distance.length;

        for (int i = start; i < n; i = (i + 1) % n) {
            if (i == destination) {
                break;
            }
            fans = fans + distance[i];
        }

        int sans = 0;

        for (int i = destination; i < n; i = (i + 1) % n) {
            if (i == start) {
                break;
            }
            sans = sans + distance[i];
        }

        int minv = Math.min(fans, sans);
        return minv;
    }
}   