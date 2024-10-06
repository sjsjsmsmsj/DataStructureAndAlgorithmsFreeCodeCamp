import java.util.ArrayList;
import java.util.Comparator;

public class Interval {
    private int start;
    private int end;
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
    // solving interval from (- , +)
    // idea if 1 interval return that interval
    // sorting intervals from small to big
    // if interval2.start <= interval1.end excuted Max(interval2.end, interval1.end)
    // else store interval result[] = that interval
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals.size() < 2) {
            return intervals;
        }
        // sorting
        intervals.sort(Comparator.comparingInt(in -> in.start));
        ArrayList<Interval> result = new ArrayList<>();
        Interval temp = intervals.get(0);
        int start = temp.start;
        int end = temp.end;
        for (int i = 1; i < intervals.size(); i ++) {
            Interval current = intervals.get(i);
            if (current.start <= end) {
                end = Math.max(current.end, end);
            } else {
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
        }
        result.add(new Interval(start, end));
        return result;
    }
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if (intervals.isEmpty() || intervals == null) {
            return intervals;
        }
        ArrayList<Interval> result = new ArrayList<>();
        int i = 0;
        while (intervals.get(i).end < newInterval.start && intervals.get(i).end < intervals.get(i + 1).start && i < intervals.size()) {
            result.add(intervals.get(i));
            i ++;
        }
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
            newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
            i ++;
        }
        result.add(newInterval);
        while (i < intervals.size()) {
            result.add(intervals.get(i));
            i ++;
        }
        return result;
    }
    public static void main(String[] args) {
        // Initializing some intervals for testing
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        ArrayList<Interval> a = insert(intervals, new Interval(5, 11));
        for (Interval k : a) {
            System.out.println(k.start + " " + k.end);
        }
        // // Merging intervals
        // ArrayList<Interval> merged = merge(intervals);

        // // Printing merged intervals
        // for (Interval interval : merged) {
        //     System.out.println("[" + interval.start + ", " + interval.end + "]");
        // }
    }
}