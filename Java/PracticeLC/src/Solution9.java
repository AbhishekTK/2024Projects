import java.util.HashSet;
import java.util.Iterator;

public class Solution9 {

    public static void main(String[] args) {
        int[] ip = { 0, 5, 3, -1, 200, 1, 0, 2, 7, 4 };
        int[] ip2 = { 100, 4, 200, 1, 2, 3 };

        int op = findLargestConsequetiveSubsequenceCount(ip);
        System.out.println(op);
        op = findLargestConsequetiveSubsequenceCount(ip2);
        System.out.println(op);

    }

    private static int findLargestConsequetiveSubsequenceCount(int[] ip) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'findLargestConsequetiveSubsequence'");
        if (ip.length == 0)
            return 0;
        int longestSub = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : ip) {
            hs.add(i);
        }

        for (int i : hs) {
            if (hs.contains(i - 1)) {
                continue;
            } else {
                int curNum = i;
                int curSub = 0;
                while (hs.contains(curNum + 1)) {
                    curNum++;
                    curSub++;
                }
                longestSub = Math.max(curSub, longestSub);
            }
        }
        // Iterator<Integer> iterator = hs.iterator();
        // while (iterator.hasNext()) {
        // int temp = iterator.next();
        // if (hs.contains(temp - 1)) {
        // continue;
        // }
        // int count = 0;
        // while (hs.contains(temp + 1)) {
        // count++;
        // temp++;
        // }
        // c = Math.max(c, count);
        // }

        return longestSub;
    }
    
}
