import java.util.ArrayList;
import java.util.List;

public class Day4 extends AOCPuzzle {

    public Day4() {
        super("4");
    }

    @Override
    void solve(List<String> input) {
        int pairs = 0;
        for (String s : input) {

            List<Integer> listOfNumbers = splitStringToNumbers(s);

            int firstNumber = listOfNumbers.get(0);
            int secondNumber = listOfNumbers.get(1);

            int thirdNumber = listOfNumbers.get(2);
            int fourthNumber = listOfNumbers.get(3);

            if (firstNumber >= thirdNumber && firstNumber <= fourthNumber && secondNumber >= thirdNumber && secondNumber <= fourthNumber) {
                pairs++;
            } else if (thirdNumber >= firstNumber && thirdNumber <= secondNumber && fourthNumber >= firstNumber && fourthNumber <= secondNumber) {
                pairs++;
            }
        }
        System.out.println("Day 4 First Answer: " + pairs);


        pairs = 0;
        for (String s : input) {
            List<Integer> listOfNumbers = splitStringToNumbers(s);

            int firstNumber = listOfNumbers.get(0);
            int secondNumber = listOfNumbers.get(1);

            int thirdNumber = listOfNumbers.get(2);
            int fourthNumber = listOfNumbers.get(3);

            if (firstNumber >= thirdNumber && firstNumber <= fourthNumber) {
                pairs++;
            } else if (secondNumber >= thirdNumber && secondNumber <= fourthNumber) {
                pairs++;
            } else if (thirdNumber >= firstNumber && thirdNumber <= secondNumber) {
                pairs++;
            } else if (fourthNumber >= firstNumber && fourthNumber <= secondNumber) {
                pairs++;
            }

        }
        System.out.println("Day 4 Second Answer: " + pairs);
    }

    private List<Integer> splitStringToNumbers(String input) {
        String[] splitByComma = input.split(",");
        String[] splitFirstByDash = splitByComma[0].split("-");
        String[] splitSecondByDash = splitByComma[1].split("-");

        int firstNumber = Integer.parseInt(splitFirstByDash[0]);
        int secondNumber = Integer.parseInt(splitFirstByDash[1]);

        int thirdNumber = Integer.parseInt(splitSecondByDash[0]);
        int fourthNumber = Integer.parseInt(splitSecondByDash[1]);

        List<Integer> results = new ArrayList<>();

        results.add(firstNumber);
        results.add(secondNumber);
        results.add(thirdNumber);
        results.add(fourthNumber);

        return results;

    }
}
