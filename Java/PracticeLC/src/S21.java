import java.util.PriorityQueue;

public class S21 {
    // 703. Kth largest element in stream

    public static void main(String[] args) {
        int[] nums = { 4, 5, 8, 2 };
        int val = 3;
        int k = 3;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k);

        kLarg(k, nums, maxHeap);
        addAndReturnKLarg(val, k, nums, maxHeap);
        val = 5;
        addAndReturnKLarg(val, k, nums, maxHeap);
        val = 10;
        addAndReturnKLarg(val, k, nums, maxHeap);
        val = 9;
        addAndReturnKLarg(val, k, nums, maxHeap);
        val = 4;
        addAndReturnKLarg(val, k, nums, maxHeap);
        val = 5;

    }

    private static void addAndReturnKLarg(int val, int k, int[] nums, PriorityQueue<Integer> maxHeap) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'addAndReturnKLarg'");
        if (maxHeap.size() < k) {
            maxHeap.offer(val);
        } else {

            int temp = maxHeap.peek();
            if (temp < val) {
                maxHeap.poll();
                maxHeap.offer(val);
            }
        }
        System.out.println(maxHeap.peek());
    }

    private static void kLarg(int k, int[] nums, PriorityQueue<Integer> maxHeap) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'kLarg'");

        for (int num : nums) {
            addAndReturnKLarg(num, k, nums, maxHeap);
        }

    }
}
