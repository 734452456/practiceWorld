package baseee;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: ttliu
 * @Date: 2021/4/25 - 04 - 25 - 16:46
 * @Description: baseee
 * @version: 1.0
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map.size());
        map.put("lili",2121);
        map.put("liwi",2124);
        map.put("lidi",2123);
        map.put("liai",2122);
        System.out.println(map.size());
        System.out.println(map.entrySet());
        System.out.println(map.get("lili"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.remove("lili"));
        System.out.println(map.isEmpty());

    }
}
