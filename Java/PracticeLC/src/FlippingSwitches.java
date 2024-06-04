
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlippingSwitches {
    public static void main(String[] args) {
        List<List<Integer>> ip = Arrays.asList(
            Arrays.asList(1,4),
            Arrays.asList(4,6),
            Arrays.asList(3,6) );
            var sample = new ArrayList<Integer>();
            sample.clear();
        HashMap<Integer,Boolean> memo = new HashMap<>();
        for(List<Integer> l : ip ){
            for(int i = l.get(0);i<=l.get(1);i++){
                if(memo.containsKey(i)){
                    boolean temp = memo.get(i);
                    memo.put(i, !temp);
                }
                memo.putIfAbsent(i, true);
            }
        }
        int op = 0;
        for(Map.Entry<Integer,Boolean> entry: memo.entrySet()){
            if(entry.getValue() == true){
                op+= entry.getKey();
                System.out.println(entry.getKey());
            }
        }
        System.out.println(memo);
        System.out.println(op);
    }
}
