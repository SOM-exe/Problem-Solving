class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {

        String[] EndTime1 = event1[1].split(":");
        int HH1 = Integer.parseInt(EndTime1[0]);
        int MM1 = Integer.parseInt(EndTime1[1]);

        String[] StartTime2 = event2[0].split(":");
        int HH2 = Integer.parseInt(StartTime2[0]);
        int MM2 = Integer.parseInt(StartTime2[1]);

        boolean check1 = false;

        if (HH1 > HH2) {
            check1 = true;
        } 
        else if (HH1 == HH2) {
            if (MM1 >= MM2) {
                check1 = true;
            }
        }

        String[] EndTime2 = event2[1].split(":");
        int HH3 = Integer.parseInt(EndTime2[0]);
        int MM3 = Integer.parseInt(EndTime2[1]);

        String[] StartTime1 = event1[0].split(":");
        int HH4 = Integer.parseInt(StartTime1[0]);
        int MM4 = Integer.parseInt(StartTime1[1]);

        boolean check2 = false;

        if (HH3 > HH4) {
            check2 = true;
        } 
        else if (HH3 == HH4) {
            if (MM3 >= MM4) {
                check2 = true;
            }
        }

        return check1 && check2;
    }
}