import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day2 extends AOCPuzzle {

    public Day2() {
        super("2");
    }

    /*
    A - ROCK
    B - PAPER
    C - SCISSORS

    X - ROCK     - 1
    Y - PAPER    - 2
    Z - SCISSORS - 3
    LOSE         - 0
    DRAW         - 3
    WIN          - 6
     */
    @Override
    void solve(List<String> input) {
        Map<String, Integer> results = new HashMap<>();
        results.put("A X", 4);
        results.put("A Y", 8);
        results.put("A Z", 3);

        results.put("B X", 1);
        results.put("B Y", 5);
        results.put("B Z", 9);

        results.put("C X", 7);
        results.put("C Y", 2);
        results.put("C Z", 6);

        int sum = 0;
        for (String s : input) {
            sum += results.get(s);
        }
        System.out.println("Day 2 First Answer: " + sum);


        results.clear();
        results.put("A X", 3);
        results.put("A Y", 4);
        results.put("A Z", 8);

        results.put("B X", 1);
        results.put("B Y", 5);
        results.put("B Z", 9);

        results.put("C X", 2);
        results.put("C Y", 6);
        results.put("C Z", 7);

        sum = 0;
        for (String s : input) {
            sum += results.get(s);
        }
        System.out.println("Day 2 Second Answer: " + sum);
    }
}
