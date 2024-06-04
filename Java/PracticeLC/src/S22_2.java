import java.util.Arrays;

public class S22_2 {
    // 435. Non overlapping intervals
    public static void main(String[] args) {
        // int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
        // int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 }, { 1, 5 } };
        // int[][] intervals = { { 1, 2 }, { 1, 2 }, { 1, 2 } };
        int[][] intervals = { { 1, 2 }, { 1, 2 }, { 1, 2 }, { 1, 2 }, { 2, 3 }, { 2, 4 } };

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int prev = 0;
        int countDelIntToNotOverLap = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[prev][1] > intervals[i][0]) {
                if (intervals[prev][1] > intervals[i][1]) {
                    prev = i;
                }
                countDelIntToNotOverLap++;
                // prev = i;
            } else {
                prev = i;
            }
        }
        System.out.println(countDelIntToNotOverLap);

    }
}
