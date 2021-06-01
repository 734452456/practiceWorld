package baseee;

import java.util.HashSet;

/**
 * @Auther: ttliu
 * @Date: 2021/4/25 - 04 - 25 - 16:19
 * @Description: baseee
 * @version: 1.0
 */
public class hasSetTest {
    public static void main(String[] args) {
        HashSet<Integer> intsss = new HashSet<>();
        intsss.add(1);
        intsss.add(1);
        intsss.add(1);
        intsss.add(1);
        System.out.println(intsss.add(1));
        System.out.println(intsss.size());
        System.out.println(intsss);
    }
}
