import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class Solution9UsingCollector {
    public static void main(String[] args) {
        List<Integer> testSeq1 = Arrays.asList(1, 3, 4, 5, 5, -4, 7, 9,
                10, 11, 12, 14, 14, 14, 14, -6, -5, -4, 0);
        class R {
            List<Integer> cur = new ArrayList<>();
            List<Integer> longest = new ArrayList<>();

            public List<Integer> getResult() {
                return (cur.size() > longest.size()) ? cur : longest;
            }

        }

        BiConsumer<R, Integer> accumulator = (r, i) -> {
            if (r.cur.isEmpty()) {
                r.cur.add(i);
            } else if (1 + r.cur.get(r.cur.size() - 1) == i) {
                r.cur.add(i);

            } else {
                if (r.longest.size() < r.cur.size()) {
                    r.longest = r.cur;
                    r.cur = new ArrayList<>();
                } else {
                    r.cur.clear();
                }
                r.cur.add(i);

            }
        };

        BiConsumer<R, R> combiner = (__, ___) -> {
        };

        List<Integer> op = testSeq1.stream().sequential()
        .collect(R::new, accumulator, combiner).getResult();
        System.out.println(op);
    }
}
