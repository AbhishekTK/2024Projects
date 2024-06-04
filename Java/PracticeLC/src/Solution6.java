public class Solution6 {
    // 15. Max prod subarr
    public static void main(String[] args) {
        // int[] ip = { 5, 3, 1, -2, 0, -5, 8, -3 }; // 120
        // int[] ip = { 2, 3, -3, 4, 5 }; // 20
        // int[] ip ={2,3,-3,4}; //6
        // int[] ip ={-2,0,-1}; //0
        int[] ip = { 5, 3, -3, 6, 7 }; // 42

        int min = ip[0], max = ip[0];
        int op = max;
        for (int i = 1; i < ip.length; i++) {
            int temp = Math.max(ip[i], Math.max(max * ip[i], min * ip[i]));
            min = Math.min(ip[i], Math.min(max * ip[i], min * ip[i]));
            max = temp;
            op = Math.max(max, op);

        }
        System.out.println(op);
    }
}
