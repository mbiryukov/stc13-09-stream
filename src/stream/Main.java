package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList(
                "v1", "v3", "v2", "v3", "v2", "v3", "v1", "v4");
/*        List<String> distinct = collection.stream().distinct()
                .collect(Collectors.toList());
        System.out.println(distinct);*/

/*        String join = collection.stream().collect(
                Collectors.joining(":","", ""));
        System.out.println(join);*/

        Map<String, String> map = collection.stream().distinct().collect(
                Collectors.toMap((p) -> p.substring(1, 2), (p) -> p.substring(0, 1)));
        System.out.println(map);

    }
}
