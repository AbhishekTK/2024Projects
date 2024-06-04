import java.util.Arrays;

public class S252MeetingRoom {
    // 252 meeting rooms
    public static void main(String[] args) {
        // int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
        int[][] intervals = { { 7, 10 }, { 2, 4 } };

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        boolean attendAll = true;
        for (int i = 0; i < intervals.length - 1; i++) {
            System.out.println(intervals[i][0] + " " + intervals[i][1]);
            if (intervals[i][1] > intervals[i + 1][0]) {
                attendAll = false;
            }
        }
        System.out.println(attendAll);

    }
}
