import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution12 {
    public static void main(String[] args) {

        // int[][] ip = new int[][] { { 1, 2, 2, 3, 5 }, { 3, 2, 3, 4, 4 }, { 2, 4, 5,
        // 3, 1 },
        // { 6, 7, 1, 4, 5 }, { 5, 1, 1, 2, 4 } };
        int[][] ip = { { 1, 2 }, { 3, 2 } };

        int row = ip.length;
        int col = ip[0].length;
        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            dfs(i, 0, pacific, ip);
            dfs(i, col - 1, atlantic, ip);
        }

        for (int j = 0; j < col; j++) {
            dfs(0, j, pacific, ip);
            dfs(row - 1, j, atlantic, ip);
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

    public static void dfs(int i, int j, boolean[][] reachable, int[][] heights) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'dfs'");

        int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        reachable[i][j] = true;
        for (int[] d : dir) {
            int newR = i + d[0];
            int newC = j + d[1];
            if (newR < 0 || newR >= heights.length || newC < 0 || newC >= heights[0].length) {
                continue;
            }
            if (reachable[newR][newR]) {
                continue;
            }
            if (heights[newR][newC] >= heights[i][j]) {
                // continue;
                dfs(newR, newC, reachable, heights);
            }
        }

    }

}
