import java.util.HashMap;
import java.util.Map;

public class MapEX {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(100, "Amila");
        map.put(101, "Vijaya");
        map.put(102, "Eanil");
        map.put(103, "Chatura");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println(map.get(101));
        System.out.println(map.get(102));
    }
}
