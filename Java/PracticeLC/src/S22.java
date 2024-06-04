import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class S22 {
    // 56. merge intervals
    public static void main(String[] args) {
        String ip1 = "1 3";
        String ip2 = "2 4";
        String ip3 = "6 10";
        String ip4 = "9 12";
        ArrayList<String> l = new ArrayList<>();
        l.add(ip1);
        l.add(ip2);
        l.add(ip3);
        l.add(ip4);
        int[][] ip = new int[4][2];
        for (int i = 0; i < l.size(); i++) {
            String[] split = l.get(i).split("\\s+");
            ip[i][0] = Integer.valueOf(split[0]);
            ip[i][1] = Integer.valueOf(split[1]);

        }

        printMergedArray(ip);
        // int[][] intervals = { { 1, 3 }, { 2, 6 }, { 0, 10 }, { 15, 18 } };
        // printMergedArray(intervals);

    }

    private static void printMergedArray(int[][] ip) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'printMergedArray'");

        Arrays.sort(ip, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> ans = new LinkedList<>();
        for (int i = 0; i < ip.length; i++) {
            int[] temp = ip[i];
            if (ans.isEmpty() || ans.getLast()[1] < temp[0]) {
                ans.add(temp);

            } else {
                int[] temp2 = ans.getLast();
                int end = Math.max(temp[1], temp2[1]);
                ans.getLast()[1] = end;
            }
        }
        int[][] array = ans.toArray(new int[ans.size()][]);
        for (int[] interval : array) {

            System.out.println(interval[0] + " " + interval[1]);
        }
        // System.out.println(ans);

    }

}
