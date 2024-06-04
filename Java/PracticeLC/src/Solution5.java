public class Solution5 {
    // 53. Maximum Subarray
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int[] nums = { 1 };
        // int[] nums = { 5, 4, -1, 7, 8 };

        int max = nums[0];
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += nums[i];
            max = Math.max(max, curSum);

        }
        System.out.println(max);

    }
}
