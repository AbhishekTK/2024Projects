import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution12_2 {
    public static void main(String[] args) throws Exception {

        int[][] ip = new int[][] { { 1, 2, 2, 3, 5 }, { 3, 2, 3, 4, 4 }, { 2, 4, 5, 3, 1 },
                { 6, 7, 1, 4, 5 }, { 5, 1, 1, 2, 4 } };
        // int[][] ip = { { 1, 2, 2, 3, 5 }, { 3, 2, 3, 4, 4 } };

        boolean[][] pacific = new boolean[ip.length][ip[0].length];
        boolean[][] atlantic = new boolean[ip.length][ip[0].length];
        try {

            for (int i = 0; i < ip.length; i++) {
                dfs(i, 0, pacific, ip);
                dfs(i, ip[0].length - 1, atlantic, ip);
            }
            for (int j = 0; j < ip[0].length; j++) {
                dfs(0, j, pacific, ip);
                dfs(ip.length - 1, j, atlantic, ip);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e);
        }
        // int[][] op = new int[ip.length][ip[0].length];
        List<List<Integer>> op = new ArrayList<>();
        for (int i = 0; i < ip.length; i++) {
            for (int j = 0; j < ip[0].length; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    op.add(Arrays.asList(i, j));
                }
            }
        }

        System.out.println(op);

    }

    static int count = 0;

    public static void dfs(int i, int j, boolean[][] reachable, int[][] heights) throws Exception {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'dfs'");
        try {

            int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
            reachable[i][j] = true;
            for (int ii = 0; i < heights.length; i++) {
                for (int jj = 0; j < heights[0].length; j++) {
                    System.out.print(reachable[ii][jj] + "-");
                    if (reachable[ii][jj]) {
                    }
                }
                System.out.println();

            }
            System.out.println(count++);
            for (int[] d : dir) {
                int newR = i + d[0];
                int newC = j + d[1];
                if (newR < 0 || newR >= heights.length || newC < 0 || newC >= heights[0].length) {
                    continue;
                }
                if (reachable[newR][newR]) {
                    continue;
                }
                if (heights[newR][newC] < heights[i][j]) {
                    continue;
                }
                dfs(newR, newC, reachable, heights);
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());

            throw new RuntimeException(e);
        }

    }

}
