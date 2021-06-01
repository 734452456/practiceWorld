package baseee;

import java.util.*;

/**
 * @Auther: ttliu
 * @Date: 2021/4/22 - 04 - 22 - 18:58
 * @Description: baseee
 * @version: 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {
      Collection col = new ArrayList();
        Class<? extends Collection> aClass = col.getClass();
        System.out.println(aClass);
        ArrayList<Object> arr1 = new ArrayList<>();
        arr1.add(0,"q");
        arr1.add(1,"q");
        arr1.add(2,"123");
        arr1.add(3,"w");
        System.out.println(arr1);
        arr1.remove(1);
        System.out.println(arr1);
        boolean q = arr1.contains("q");
        System.out.println(q+"是否包含");
        arr1.set(1,"ee");
        System.out.println(arr1);
        Object o = arr1.get(2);
        System.out.println(o);
        boolean ee = arr1.remove("ee");
        System.out.println(arr1+"ee是否删除成功"+ee);
        /**
         *  
         * 
         * @author ttliu
         * @date 2021/4/22 21:06
         * @param [java.lang.String[]]
         * @return void
         */
        for (Object o1:arr1
             ) {
            System.out.println(o1);

        }
        Iterator<Object> iterator = arr1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        col.add(12);
//        col.add(123);
//        col.add(123);
//        col.add(124);
//        col.add(125);
//        System.out.println(col);
//        System.out.println(col.toString());
//        List list =Arrays.asList(new Integer[]{1,2,2,3});
//        col.addAll(list);
//        System.out.println(col);
//        boolean isremove = col.remove(123);
//
//        System.out.println(col+"remove");
//        System.out.println("s是否删除"+isremove);
//        col.clear();
//        System.out.println(col);
//        System.out.println(col.isEmpty());
//        System.out.println(col.size());
//        List list1 = Arrays.asList(new Integer[]{1,2,2,3});
//        ArrayList arrayList = new ArrayList();
//        arrayList.addAll(list1);
//
//        ArrayList arrayList2 = new ArrayList();
//        arrayList2.addAll(list1);
//        System.out.println(arrayList2);
//        System.out.println(arrayList);
//        System.out.println(arrayList.contains(2));
//        Iterator it = arrayList.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        for (int i=0;i<arrayList.size();i++){
//            Object o = arrayList.get(i);
//            System.out.println(o);
//
//        }
//        for (Object o:arrayList
//             ) {
//            System.out.println(o);
//
//        }


    }
}
