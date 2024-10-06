public class SubSquence {
    public static void main(String[] args) {
        String sq = "abcdef";
        String subsq = "afe";
        System.out.println(isSubseq(sq, subsq));
    }
    public static boolean isSubseq(String squence, String subsquece) {
        int i = 0; 
        int j = 0;
        while (i < squence.length() && j < subsquece.length()) {
            if (squence.charAt(i) == subsquece.charAt(j)) {
                j ++;
            }
            i ++;
        }
        return j == subsquece.length();
    }
}
