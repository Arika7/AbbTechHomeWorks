import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Set<Integer> sets = new HashSet<>();
        sets.add(3);
        sets.add(2);
        sets.add(1);

        sets.removeIf(g -> g == 3);

        System.out.println(sets);

    }
}
