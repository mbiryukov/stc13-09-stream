package cycle;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

/*        for (int number : numbers){
            System.out.println(number);
        }*/

        numbers.forEach(value -> System.out.println(value));
    }
}
