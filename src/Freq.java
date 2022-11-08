import java.util.HashMap;
import java.util.Map;

public class Freq {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);
        int count = 0;
        for (Map.Entry<String, Integer> mapIt : map.entrySet()) {
            if (mapIt.getValue() == 0) continue;
            String str = mapIt.getKey();
            Boolean bool = true;
            str = "" + str.charAt(1) + str.charAt(0);
            if (str.equals(mapIt.getKey()) && mapIt.getValue() % 2 == 1 && bool) {
                count += (map.get(str)/2+1) * 2;
                map.put(str, 0);
                bool = false;
            } else if (str.equals(mapIt.getKey())) {
                count += 2 * (map.get(str) / 2);
                map.put(str, 0);
            } else if (map.containsKey(str)) {
                count += (Math.min(mapIt.getValue(), map.get(str)) * 4);
                map.put(str, 0);
                map.put(mapIt.getKey(), 0);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Freq freq = new Freq();
        String[] sttr = {"dd", "aa", "bb", "dd", "aa", "dd", "bb", "dd", "aa", "cc", "bb", "cc", "dd", "cc"};
        System.out.println(freq.longestPalindrome(sttr));
    }
}
