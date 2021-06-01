package suanfa.class04;

import java.util.PriorityQueue;

/**
 * @Auther: ttliu
 * @Date: 2021/6/1 - 06 - 01 - 9:09
 * @Description: suanfa.class04
 * @version: 1.0
 */
public class SortArrayDistacnceLessK {

    public void sortedArrayDistanceLessk(int[] arr,int k){
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        heap.add(1);
        heap.add(5);
        heap.add(2);
        heap.add(8);
        heap.add(4);
        while (!heap.isEmpty()){
            System.out.println(heap.poll());
        }
        System.out.println("over");
    }
}
