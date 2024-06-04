public class Solution8 {

    public static void main(String[] args) {
        int[][] input = new int[][] { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 1 } };
        int op = islands(input);
        System.out.println(op);
    }

    private static int islands(int[][] input) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'islands'");
        if (input.length == 0) {
            return 0;
        }
        int op = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] == 1) {
                    op++;
                    dfs(i, j, input);
                }
            }
        }

        return op;

    }

    private static void dfs(int i, int j, int[][] input) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'dfs'");
        int r = input.length;
        int c = input[0].length;
        int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        if (i < 0 || j < 0 || i >= r || j >= c || input[i][j] == 0) {
            return;
        }
        input[i][j] = 0;
        for (int[] e : dir) {
            dfs(i + e[0], j + e[1], input);
        }

    }
}
