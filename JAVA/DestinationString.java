import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DestinationString {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "def", "ghi");
        Map<String, String> map = new HashMap<>();
        map.put("abc", "def");
        System.out.println(list.stream().map(s -> map.get(s))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString());
    }

    public static String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> list : paths)
            map.put(list.get(0), list.get(1));
        String destination = paths.get(0).get(0);
        while (map.containsKey(destination))
            destination = map.get(destination);
        return destination;
    }
}
