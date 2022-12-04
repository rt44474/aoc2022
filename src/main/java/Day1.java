import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day1 extends AOCPuzzle {

    public Day1() {
        super("1");
    }

    @Override
    void solve(List<String> input) {
        int max = 0;
        int sum = 0;
        for (String s : input) {
            if (!s.isBlank()) {
                sum += Integer.parseInt(s);
            } else {
                if (sum > max) {
                    max = sum;
                }
                sum = 0;
            }
        }
        System.out.println("Day 1 First Answer: " + max);

        List<Integer> topThree = new ArrayList<>();
        sum = 0;
        for (String s : input) {
            if (!s.isBlank()) {
                sum += Integer.parseInt(s);
            } else if (topThree.size() < 3) {
                topThree.add(sum);
                sum = 0;
            } else {
                int lowestIndex = topThree.indexOf(Collections.min(topThree));
                int lowest = topThree.get(lowestIndex);
                if (sum > lowest) {
                    topThree.set(lowestIndex, sum);
                }
                sum = 0;
            }
        }
        max = topThree.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Day 1 Second Answer: " + max);

    }
}
