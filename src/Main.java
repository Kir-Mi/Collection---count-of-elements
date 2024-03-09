import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 3, 5, 1, 4, 3};
        Map<Integer, Integer> integerMap = countElements(array);
        System.out.println(integerMap);
    }

    public static Map<Integer, Integer> countElements(Integer[] integers) {
        Map<Integer, Integer> elements = new HashMap<>();
        for (Integer integer : integers) {
            if(elements.containsKey(integer)) {
                elements.put(integer, elements.get(integer) + 1);
            } else {
                elements.put(integer, 1);
            }
        }
        return elements;
    }
}