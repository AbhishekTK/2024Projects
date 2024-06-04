public class Solution5_2 {
    // max array diff
    public static void main(String[] args) {
        int[] ip = { 2, 3, 10, 2, 4, 8, 1 };
        int op = 0;
        for (int i = 1; i < ip.length; i++) {
            for (int j = 0; j < i; j++) {
                if (ip[i] - ip[j] > op) {
                    op = ip[i] - ip[j];
                }
            }
        }
        System.out.println(op);
    }
}
