public class Solution14 {
    // 11. container with most water
    public static void main(String[] args) {
        // int[] ip = { 5, 2, 4, 8, 7, 6 };
        int[] ip = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int max = 0;
        int l = 0, r = ip.length - 1;
        while (l < r) {
            // int area = (r-l)
            max = Math.max(max, Math.min(ip[l], ip[r]) * (r - l));
            if (ip[l] <= ip[r])
                l++;
            else
                r--;

        }
        System.out.println(max);
    }
}
