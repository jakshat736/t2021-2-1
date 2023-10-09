import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        List<Integer> inputList = new ArrayList<>();

        System.out.println("Enter a list of integers (enter -1 to finish input):");
        int number;
        while (true) {
            System.out.print("Enter an integer (or -1 to finish): ");
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            inputList.add(number);
        }

        Map<Integer, Integer> counts = new HashMap<>();

        List<Integer> multiples = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        for (Integer multiple : multiples) {
            counts.put(multiple, 0);
        }

        for (Integer num : inputList) {
            for (Integer multiple : multiples) {
                if (num % multiple == 0) {
                    counts.put(multiple, counts.get(multiple) + 1);
                }
            }
        }

        System.out.println("Counts of multiples:");
        for (Integer multiple : multiples) {
            System.out.println(multiple + ": " + counts.get(multiple));
        }

        scanner.close();
    }
}
