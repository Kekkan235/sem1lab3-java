import java.util.*;

public class Task5 {

    public static <K, V> Map<V, K> swapKeysAndValues(Map<K, V> map) {
        Map<V, K> invertedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("One", 1);
        originalMap.put("Two", 2);
        originalMap.put("Three", 3);

        System.out.println("Исходная Map: " + originalMap);

        Map<Integer, String> swappedMap = swapKeysAndValues(originalMap);
        System.out.println("Инвертированная Map: " + swappedMap);
    }
}