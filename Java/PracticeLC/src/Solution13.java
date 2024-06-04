public class Solution13 {
    public static void main(String[] args) {
        String text1 = "abcde", text2 = "ace";
        // String text1 = "abc", text2="abc";
        int[][] count = new int[text1.length() + 1][text2.length() + 1];
        for (int i = text1.length() - 1; i >= 0; i--) {
            for (int j = text2.length() - 1; j >= 0; j--) {
                System.out.print(count[i][j]);
            }
            System.out.println();
        }
        for (int j = text2.length() - 1; j >= 0; j--) {
            for (int i = text1.length() - 1; i >= 0; i--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    count[i][j] = 1 + count[i + 1][j + 1];
                } else {
                    count[i][j] = Math.max(count[i + 1][j], count[i][j + 1]);
                }
            }
        }
        for (int i = text1.length() - 1; i >= 0; i--) {
            for (int j = text2.length() - 1; j >= 0; j--) {
                System.out.print(count[i][j]);
            }
            System.out.println();
        }
        System.out.println(count[0][0]);
    }
}
