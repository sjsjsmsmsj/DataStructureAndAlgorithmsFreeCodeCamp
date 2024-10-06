import java.util.HashMap;

public class LongestString {
    public static void main(String[] args) {
        String str = "bbbb";
        System.out.println(lengthOfLongestSubstringWithoutRepeatCharacters(str));
    }
    public static int lengthOfLongestSubstringWithoutRepeatCharacters(String arr) {
        int max = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int current = 0;
        char[] charaters = arr.toCharArray();
        for (int i = 0; i < charaters.length; i ++) {
            char c = charaters[i];
            if (hashMap.containsKey(c)) {
                current = 1;
            } else {
                current ++;
                if (max < current) {
                    max = current;
                }
            }
            hashMap.put(c, i);
        }
        return max;
    }
}
