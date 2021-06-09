package suanfa.class04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @Auther: ttliu
 * @Date: 2021/6/1 - 06 - 01 - 15:02
 * @Description: suanfa.class04
 * @version: 1.0
 */
public class Code_heap02 {
    public static class Student {
        public int classNo;
        public int age;
        public int id;

        public Student(int c, int a, int i) {
            classNo = c;
            age = a;
            id = i;
        }

    }
    public  static  class MyHeap<T>{
        private ArrayList<T> heap;
        //记录这条数据在堆的哪个位置上    这个表在大部分系统中没有 或者说如果系统有这个表会付出很大的代价 这个表大部分时间用不到
        private HashMap<T,Integer> indexMap;
        private int heapsize;
        private Comparator<? super T> comparator;

        public MyHeap(Comparator<? super T> com){
            heap=new ArrayList<>();
            indexMap=new HashMap<>();
            heapsize=0;
            comparator=com;
        }

        public void push(T value) {
            heap.add(value);
            indexMap.put(value,heapsize);
            heapInert(heapsize++);

        }

        private void heapInert(int index) {
            while(comparator.compare(heap.get(index),heap.get((index-1)/2))<0){
                swap(index,(index-1)/2);
                index=(index-1)/2;
            }
        }

        private void swap(int i, int j) {
            T o1 = heap.get(i);
            T o2 = heap.get(j);
            heap.set(i,o2);
            heap.set(j,o1);
            indexMap.put(o1,j);
            indexMap.put(o2,i);

        }

        public void resign(T s) {
            int indexofvalue = indexMap.get(s);
            heapInert(indexofvalue);
            heapify(indexofvalue,heapsize);


        }

        private void heapify(int index, int heapsize) {
            int left=index*2+1;
            while(left<heapsize)
            {
                int largest=left+1<heapsize && (comparator.compare(heap.get(left+1),heap.get(left))<0)
                        ? left+1:left;
                largest=comparator.compare(heap.get(largest),heap.get(index))<0 ?
                        largest:index;
                if(index==largest){
                    break;
                }
                swap(largest,index);
                index=largest;
                left=index*2+1;

            }
        }

        public T pop() {
            T ans = heap.get(0);
            int end = heapsize - 1;
            swap(0,end);
            heap.remove(end);
            indexMap.remove(ans);
            heapify(0,--heapsize);
            return ans;

        }

        public boolean isEmpty() {
            return  heapsize==0;

        }
    }
    public static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
        }

    }

    public static void main(String[] args) {
       double c=0.9-0.8;
        BigDecimal A = new BigDecimal("0.9");
        BigDecimal B = new BigDecimal("0.8");
        System.out.println(A.subtract(B).doubleValue());
        BigDecimal bigDecimal = new BigDecimal(c);
        System.out.println(bigDecimal);

        Student s1=null;
        Student s2=null;
        Student s3=null;
        Student s4=null;
        Student s5=null;
        s1=new Student(2,39,355);
        s2=new Student(5,334,6860);
        s3=new Student(4,45,5454);
        s4=new Student(2,36,5566);
        s5=new Student(3,25,5555);
      /*  PriorityQueue<Student> heap=new PriorityQueue<>(new StudentComparator());
        heap.add(s1);
        heap.add(s2);
        heap.add(s3);
        heap.add(s4);
        heap.add(s5);
        while (!heap.isEmpty()){
            Student cur = heap.poll();
            System.out.println(cur.classNo + "," + cur.age + "," + cur.id);
        }*/


        MyHeap<Student> myHeap = new MyHeap<>(new StudentComparator());
        myHeap.push(s1);
        myHeap.push(s2);
        myHeap.push(s3);
        myHeap.push(s4);
        myHeap.push(s5);
        
        s2.age=34;
        myHeap.resign(s2);

        while (!myHeap.isEmpty()){
            Student cur = myHeap.pop();
            System.out.println(cur.classNo + "," + cur.age + "," + cur.id);
        }



  }
}
