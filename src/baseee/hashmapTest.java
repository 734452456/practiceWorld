package baseee;

import sun.misc.Hashing;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Auther: ttliu
 * @Date: 2021/4/26 - 04 - 26 - 20:21
 * @Description: baseee
 * @version: 1.0
 */
public class hashmapTest {
    public  static void main(String[] args) {
        new HashSet<>();
        HashMap<Integer,String> map = new HashMap<>();
        map.put(12,"sf");
        map.put(122,"sf");
        map.put(123,"sf");
        map.put(121,"sf");
        map.put(12,"sf");
        System.out.println(map.size());
        System.out.println(map);
        CSTest cc = new CSTest();
        hashmapTest hhp = new hashmapTest();
        String ss=String.valueOf(cc);
        int hash = hhp.hash(ss);
        System.out.println(hash );
    }
    final int  hash(Object cc){
        int h = 0;
   if(cc instanceof  String){
        h = Hashing.stringHash32((String) cc);
       System.out.println(h+"iffiif");
   }
        return h;
    }
}
