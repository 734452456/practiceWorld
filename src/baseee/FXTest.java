package baseee;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Auther: ttliu
 * @Date: 2021/4/23 - 04 - 23 - 16:43
 * @Description: baseee
 * @version: 1.0
 */
public class FXTest {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        System.out.println(integers);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("ada");
        strings.add("1");
        System.out.println(strings);
        GenericTest<Object> object = new GenericTest<>();
        object.age="er";
        object.b(new String[]{"qw","qw","df"});
        object.a(12);
        System.out.println(object);
        GenericTest<String> StringT = new GenericTest<>();
        StringT.a("dsds");
        StringT.b(new String[]{"qqq"});

    }
}

class  GenericTest<E>{
    String age;
    String SEX;
    public  void a (E e){
        System.out.println(e);

    }
    public  void  b(E[] f){
        System.out.println(Arrays.toString(f));

    }

}
