import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution19 {

    // 15. 3 sum
    public static void main(String[] args) {
        // int[] nums = {0,1,1};
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        // int[] nums = { -5,0,-3,5, 1, -5,0,2,1 };
        Arrays.sort(nums);
        List<List<Integer>> op = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int l = i + 1, r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[l] + nums[r];
                    if (sum < 0) {
                        l++;
                    } else if (sum > 0) {
                        r--;
                    } else {
                        op.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l - 1]) {
                            ++l;
                        }
                    }
                }
            }
        }
        System.out.println(op);
    }
}
