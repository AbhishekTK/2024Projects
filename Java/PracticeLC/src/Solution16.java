import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution16 {

    // 322. coin change
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        int count = 0;
        int[] op = new int[amount + 1];
        Arrays.fill(op, amount + 1);
        op[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    op[i] = Math.min(op[i], 1 + op[i - coins[j]]);

                }

                int sub = i - coins[j];
                if (sub == 0) {
                }
            }
        }
        List<Integer> asList = Arrays.stream(op).boxed().collect(Collectors.toList());
        System.out.println(asList);
        if (op[amount] < amount + 1) {
            System.out.println(op[amount]);

        } else {
            System.out.println(-1);
        }

    }

}
