import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution20 {

    // 621 task scheduler, tasks - A-Z,cooling time n;
    public static void main(String[] args) {
        char[] tasks = new char[] { 'A', 'B', 'A' };
        // char[] tasks = new char[] { 'A', 'A', 'A', 'B', 'B', 'B' };

        // char[] tasks = ["A","B","A"];
        int n = 2;
        HashMap<Character, Integer> memo = new HashMap<>();
        for (char task : tasks) {
            memo.put(task, memo.getOrDefault(task, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(memo.values());

        int time = 0;
        while (!maxHeap.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) {
                if (!maxHeap.isEmpty()) {

                    temp.add(maxHeap.poll());
                }
            }
            for (int freq : temp) {
                if (--freq > 0) {
                    maxHeap.add(freq);
                }
            }
            System.out.println(temp.size());
            time += maxHeap.isEmpty() ? temp.size() : n + 1;
            System.out.println("Time:" + time);

        }
        System.out.println(time);

    }
}
