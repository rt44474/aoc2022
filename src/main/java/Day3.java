import java.util.HashSet;
import java.util.List;

public class Day3 extends AOCPuzzle {

    public Day3() {
        super("3");
    }

    @Override
    void solve(List<String> input) {
        //lowercase -96
        //uppercase -38
        int sum = 0;
        for (String s : input) {
            int mid = s.length() / 2;
            String[] parts = {s.substring(0, mid), s.substring(mid)};
            String firstHalf = parts[0];
            String secondHalf = parts[1];
            HashSet<Character> map = new HashSet<>();
            for (Character c : firstHalf.toCharArray()) {
                map.add(c);
            }
            sum = getSum(sum, secondHalf, map);
        }
        System.out.println("Day 3 First Answer: " + sum);
        sum = 0;
        for (int i = 0; i < input.size(); i += 3) {
            String firstElf = input.get(i);
            String secondElf = input.get(i + 1);
            String thirdElf = input.get(i + 2);

            HashSet<Character> firstElfMap = new HashSet<>();
            HashSet<Character> duplicatedFirstAndSecond = new HashSet<>();
            for (Character c : firstElf.toCharArray()) {
                firstElfMap.add(c);
            }
            for (Character c1 : secondElf.toCharArray()) {
                if (firstElfMap.contains(c1)) {
                    duplicatedFirstAndSecond.add(c1);
                }
            }
            sum = getSum(sum, thirdElf, duplicatedFirstAndSecond);
        }
        System.out.println("Day 3 Second Answer: " + sum);


    }

    private int getSum(int sum, String elf, HashSet<Character> map) {
        for (Character c2 : elf.toCharArray()) {
            if (map.contains(c2)) {
                int ascii = (int) c2;
                if (c2 >= 97) {
                    sum += c2 - 96;
                    break;
                } else {
                    sum += c2 - 38;
                    break;
                }
            }
        }
        return sum;
    }
}
