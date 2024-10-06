
import java.util.HashMap;

public class RemoveVowels {
    public static void main(String[] args) {
        String thinh = "what is your name ?";
        System.out.println(removeVowels(thinh));
    }
    public static String removeVowels(String thinhDepTraiNhatTheGioi) {
        HashMap<Character, Character> thinh = new HashMap<>();
        char[] chars = thinhDepTraiNhatTheGioi.toCharArray(); // to compare in hashMap
        String str = "";
        thinh.put('a', 'a');
        thinh.put('e', 'e');
        thinh.put('i', 'i');
        thinh.put('u', 'u');
        thinh.put('o', 'o');
        for (char ch: chars) {
            if (!thinh.containsKey(ch)) {
                str += ch;
            }
        }
        return str;
    }
}
