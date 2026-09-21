class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int c = 0;
        for(int i = 0; i<startTime.length; i++){
            for(int j = i; j<endTime.length; j++){
               if(queryTime >= startTime[i] && queryTime <= endTime[j]){
                c++;
               }
               break;
           }
        }
        return c;
    }
}