public class Solution15 {
    // 70. climbing stairs
    public static void main(String[] args) {
        int n = 2;
        int n2 = 3;
        int n3 = 5;
        findTotalDistinctClimbingWaysToReachTop(n);
        findTotalDistinctClimbingWaysToReachTop(n2);
        findTotalDistinctClimbingWaysToReachTop(n3);
        findTotalDistinctClimbingWaysToReachTop(4);
    }

    private static void findTotalDistinctClimbingWaysToReachTop(int n) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'findTotalDistinctClimbingWaysToReachTop'");
        if (n == 1) {
            System.out.println("Output:" + 1);
        }
        int n1 = 1;
        int n2 = 2;
        // int total = 0;
        for (int i = 3; i <= n; i++) {
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        // return n2;
        System.out.println("Output:" + n2);

    }
}
