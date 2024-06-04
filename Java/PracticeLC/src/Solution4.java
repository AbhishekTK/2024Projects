import java.util.Arrays;

public class Solution4 {
    // 238. Product of Array except self
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        // int[] nums = {-1,-1,0,-3,3};

        int[] op = new int[nums.length];
        Arrays.fill(op, 1);
        int start = 1;
        for (int i = 0; i < nums.length; i++) {
            op[i] = start;
            start = start * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(op[i] + "  ");

        }
        System.out.println();
        int end = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            op[i] *= end;
            end = end * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(op[i] + "  ");
        }

    }
}
