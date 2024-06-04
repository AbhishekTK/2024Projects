import java.util.Arrays;

public class S253MeetingRoom2 {

    // 253. Meeting Rooms II
    public static void main(String[] args) {
        // int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };

        int[][] intervals = { { 0, 5 }, { 5, 10 }, { 15, 20 } };
        findMinMeetingRooms(intervals);
    }

    private static void findMinMeetingRooms(int[][] intervals) {

        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);// 0,5,15
        Arrays.sort(end); // 10,20,30
        int startPtr = 0, endPtr = 0;
        int result = 0;
        while (startPtr < start.length) {
            if (start[startPtr] >= end[endPtr]) {
                result--;
                endPtr++;
            }
            result++;
            startPtr++;
        }
        System.out.println(result);

    }

}
