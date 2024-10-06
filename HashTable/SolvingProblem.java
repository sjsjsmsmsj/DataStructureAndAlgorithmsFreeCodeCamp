
import java.util.HashSet;
import java.util.Set;


public class SolvingProblem {
    public static void main(String[] args) {
        int nums[] =  { 1, 2, 3, 4, 5, 1 };
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int nums[]) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) {
                return true;
            }
            set.add(x);
        }
        return false;
    }
}
