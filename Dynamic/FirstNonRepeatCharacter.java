import java.util.HashMap;

public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        String thinhDepTrai = "racecars";
        System.out.println(firstNonRepeatCharacter(thinhDepTrai));
    }
    public static int firstNonRepeatCharacter(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < chars.length; i ++) {
            char c = chars[i];
            if (hashMap.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
