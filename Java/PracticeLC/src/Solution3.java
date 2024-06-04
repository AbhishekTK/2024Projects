import java.util.HashSet;

public class Solution3 {
    // 217. Contains Duplicate
    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 1 };
        int[] nums = { 1, 2, 3, 4 };
        HashSet<Integer> memo = new HashSet<>();
        boolean dup = false;
        for (int i = 0; i < nums.length; i++) {
            if (memo.contains(nums[i])) {
                dup = true;
            } else {

                memo.add(nums[i]);
            }
        }
        System.out.println(dup);
    }
}
