import java.util.HashMap;
import java.util.HashSet;

public class Solution1 {
    // 1. two sum
    public static void main(String[] args) {
        int[] ip = { 2, 7, 11, 15 };
        int target = 9;

        HashMap<Integer, Integer> memo = new HashMap<>();
        for (int i = 0; i < ip.length; i++) {
            if (memo.containsKey(target - ip[i])) {
                System.out.println(i + " " + memo.get(target - ip[i]));
            }
            memo.put(ip[i], i);
        }

    }
}
