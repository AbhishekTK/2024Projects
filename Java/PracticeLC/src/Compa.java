import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Compa {

    public static void main(String[] args) {
        List<String> ip = Arrays.asList("AWord", "AWord", "BWord", "BWord");
        HashMap<String, Integer> memo = new HashMap<>();
        for (String s : ip) {
            if (memo.containsKey(s)) {
                memo.put(s, memo.get(s) + 1);
            } else {
                memo.put(s, 1);
            }
        }

        // PriorityQueue<Intger>;
        // memo.stream().s
        // ip.stream().collect(Collectors.toMap(, (0,count) -> count++)))
        System.out.println(memo);
        String cities = "Delhi,Agra,Bihar,UP,Delhi,Agra,Bihar,UP,Delhi,Bihar,Delhi,Agra,Delhi";
        Stream.of(cities.split(","))
                .collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));

        TreeMap<String, Long> groupByCitiesMap = Stream.of(cities.split(","))
                .collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));
        System.out.println(groupByCitiesMap);
        // TreeMap<String, CityReport> treeMap = new TreeMap();
        // for (String city : cities.split(",")) {
        // Compa c = new Compa();
        // Compa.CityReport cityReport = c. new CityReport(city);//.CityReport(city);
        // if (treeMap.containsKey(city)) {
        // treeMap.computeIfPresent(city, (key, val) -> {
        // val.counter += 1;
        // return val;
        // });
        // } else {
        // treeMap.put(city, cityReport);
        // }
        // }
        // List<CityReport> sortedCityReport = treeMap.values().stream()
        // .sorted(new ComparatorFilter(new ComparatorByNumber(), new
        // ComparatorByName()))
        // .collect(Collectors.toList());

        // System.out.println("Sort By Count first then City Name " + sortedCityReport);
    }

    static class CityReport {
        String city;
        Long counter;

        CityReport(String city2) {
            this.city = city2;
            this.counter = 1L;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            CityReport that = (CityReport) o;
            return Objects.equals(city, that.city);
        }

        @Override
        public int hashCode() {

            return Objects.hash(city);
        }

        @Override
        public String toString() {
            return "CityReport{" +
                    "city='" + city + '\'' +
                    ", counter=" + counter +
                    '}';
        }

    }

    class ComparatorByNumber implements Comparator<CityReport> {

        @Override
        public int compare(CityReport o1, CityReport o2) {
            // TODO Auto-generated method stub
            return (int) (o1.counter - o2.counter);

        }
    }

    class ComparatorByName implements Comparator<CityReport> {

        @Override
        public int compare(CityReport o1, CityReport o2) {
            // TODO Auto-generated method stub
            return o1.city.compareTo(o2.city);
            // throw new UnsupportedOperationException("Unimplemented method 'compare'");
        }
    }

    class ComparatorFilter implements Comparator<CityReport> {

        private final List<Comparator<CityReport>> comparators;

        ComparatorFilter(Comparator<CityReport>... comparators) {
            this.comparators = Arrays.asList(comparators);
        }

        @Override
        public int compare(CityReport o1, CityReport o2) {
            for (Comparator c : this.comparators) {
                int val = c.compare(o1, o2);
                if (val != 0) {
                    return val;
                }
            }
            return 0;
        }
    }

}
