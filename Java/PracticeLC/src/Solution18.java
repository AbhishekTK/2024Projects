public class Solution18 {
    // 33. search in rotated sorted array

    public static void main(String[] args) {
        int[] ip = { 4, 5, 6, 7, 0, 1, 2 };
        // int tar = 0;
        int tar = 5;

        int l = 0, r = ip.length - 1;
        // int min = ip[0];
        int ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (ip[m] == tar) {
                ans = m;
            }

            if (ip[l] <= ip[m]) {
                if (tar < ip[l] || tar > ip[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else {
                if (tar > ip[r] || tar < ip[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }

        }
        System.out.println(ans);
    }

}
