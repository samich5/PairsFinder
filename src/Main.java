
import java.util.HashMap;
import java.util.Map;

public class Main
{

    public static final String BY_COMMA = ",";

    public static void findPairs(String[] list, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            var currentNumber = Integer.parseInt(list[i]);
            if (map.containsKey(target - currentNumber)) {
                System.out.printf("+ %d,%s\n", currentNumber, list[map.get(target - currentNumber)]);
            }
            map.put(currentNumber, i);
        }
    }

    public static void main(String... args) {
        var listOfNumbers = args[0];
        var target = Integer.parseInt(args[1]);
        if (listOfNumbers != null) {
            findPairs(listOfNumbers.split(BY_COMMA), target);
        }
    }
}
