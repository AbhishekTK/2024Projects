import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution7 {

    public static Map<Character, List<Character>> reversedAdjacencyList = new HashMap<>();
    // public boolean[] seen = new boolean[10];
    public static Map<Character, Boolean> seen = new HashMap<>();
    public static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        // String[] alienWords = new String[] {"wrt,"wrf","er","ett","rftt"};
        String[] alienWordDict = new String[] { "wrt", "wrf", "er", "ett", "rftt" };
        // output = String.valueOf(getOutput(alienWordDict));

        System.out.println("Output: " + getOutput(alienWordDict));
    }

    public static String getOutput(String[] alienWordDict) {

        for (String e : alienWordDict) {
            for (Character c : e.toCharArray()) {
                reversedAdjacencyList.putIfAbsent(c, new ArrayList<>());
            }
        }
        System.out.println(reversedAdjacencyList);
        System.out.println(seen);
        System.out.println(output);
        for (int i = 0; i < alienWordDict.length - 1; i++) {
            String word1 = alienWordDict[i];
            String word2 = alienWordDict[i + 1];
            if (word1.length() > word2.length() && word1.startsWith(word2)) {
                return "";
            }
            for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {

                if (word1.charAt(j) != word2.charAt(j)) {
                    reversedAdjacencyList.get(word2.charAt(j)).add(word1.charAt(j));
                    break;
                }
            }
        }

        System.out.println(reversedAdjacencyList);
        System.out.println(seen);
        System.out.println(output);

        for (Character c : reversedAdjacencyList.keySet()) {
            boolean res = dfs(c);
            System.out.println(reversedAdjacencyList);
            System.out.println(seen);
            System.out.println(output);
            if (!res) {
                return "";
            }
        }

        System.out.println(reversedAdjacencyList);
        System.out.println(seen);
        System.out.println(output);
        if (output.length() < reversedAdjacencyList.size()) {
            return "";
        }
        return output.toString();
    }

    public static boolean dfs(Character c) {
        if (seen.containsKey(c)) {
            return seen.get(c);
        }
        seen.put(c, false);
        for (Character next : reversedAdjacencyList.get(c)) {
            boolean res = dfs(next);
            if (!res)
                return false;
        }
        System.out.println(reversedAdjacencyList);
        System.out.println(seen);
        System.out.println(output);
        seen.put(c, true);
        output.append(c);
        return true;
    }
}
