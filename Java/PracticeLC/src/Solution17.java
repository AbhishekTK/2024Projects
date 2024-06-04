public class Solution17 {
    // 153. Find min in rotated sorted array

    public static void main(String[] args) {
        int[] ip = { 3, 4, 5, 1, 2 };
        // int[] ip = { 3 };

        int l = 0, r = ip.length - 1;
        int min = ip[0];
        while (l <= r) {
            if (ip[l] < ip[r]) {
                min = Math.min(min, ip[l]);
            }
            int m = (l + r) / 2;
            min = Math.min(min, ip[m]);

            if (ip[l] <= ip[m]) {
                l = m + 1;
            } else {
                r = m - 1;
            }

        }
        System.out.println(min);
    }

}
