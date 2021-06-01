package baseee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Auther: ttliu
 * @Date: 2021/4/25 - 04 - 25 - 11:52
 * @Description: baseee
 * @version: 1.0
 */
public class LinklistTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aa");
        strings.add("ab");
        strings.add("ax");
        strings.add("av");
        ListIterator<String> listit = strings.listIterator();
        while (listit.hasNext()){
            if ("ab".equals(listit.next())){
                listit.add("ab");
            }
        }
        while (listit.hasPrevious()){
            System.out.println(listit.previous());
        }


        LinkedList<String> link = new LinkedList<>();
        link.add("asf1");
        link.add("asf");
        link.add("asf");
        link.add("asf");
        link.add("asf5");
        System.out.println(link);
        //增删改查
        link.pollFirst();
        System.out.println(link);
        link.addFirst("1sss");
        link.addLast("eee111");
        System.out.println(link);
        link.pollLast();
        System.out.println(link);
        link.offer("offer1111");
        System.out.println(link);
        Iterator<String> iterator = link.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Iterator<String> as = link.iterator(); as.hasNext();
             ) {
            System.out.println(as.next());
            
        }


    }
}
