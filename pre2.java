import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class pre2 {
    public static void main(String[] args) {
        Integer[] A = {150, 340, 471, 125, 852, 269, 34};
        Integer[] B = {330, 34, 471, 450, 301, 269, 145};

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(A));

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(B));

        // Union of set1 and set2
        Set<Integer> data1 = new HashSet<>(set1);
        data1.addAll(set2);
        System.out.println("Union of sets: " + data1);

        // Intersection of set1 and set2
        Set<Integer> data2 = new HashSet<>(set1);
        data2.retainAll(set2);
        System.out.println("Intersection of sets: " + data2);
    }
}
