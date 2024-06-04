public class Solution10 {
    public static void main(String[] args) {
        int[] housesMoney = { 2, 3, 2, 2, 4 };
        findMaxRob2Amount(housesMoney);
        findMaxRob1Amount(housesMoney);

    }

    private static void findMaxRob2Amount(int[] housesMoney) {
        // TODO Auto-generated method stub
        if (housesMoney.length == 0) {
            System.out.println("0");
        }
        int h1 = 0;
        int h2 = 0;
        int max1 = housesMoney[0];
        for (int i = 0; i < housesMoney.length - 1; i++) {
            max1 = Math.max(h1 + housesMoney[i], h2);
            h1 = h2;
            h2 = max1;
        }
        h1 = 0;
        h2 = 0;
        int max2 = 0;
        for (int i = 1; i < housesMoney.length; i++) {
            max2 = Math.max(h1 + housesMoney[i], h2);
            h1 = h2;
            h2 = max2;
        }
        int maxRob = Math.max(max1, max2);
        System.out.println(maxRob);
        // throw new UnsupportedOperationException("Unimplemented method
        // 'findMaxRob2Amount'");
    }

    private static void findMaxRob1Amount(int[] housesMoney) {
        // TODO Auto-generated method stub
        int max = housesMoney[0];
        int h1 = 0, h2 = 0;
        for (int i = 0; i < housesMoney.length; i++) {
            max = Math.max(h1 + housesMoney[i], h2);
            h1 = h2;
            h2 = max;
        }
        System.out.println(max);
        // throw new UnsupportedOperationException("Unimplemented method
        // 'findMaxRob1Amount'");
    }
}
