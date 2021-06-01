package suanfa.class04;

/**
 * @Auther: ttliu
 * @Date: 2021/5/27 - 05 - 27 - 11:33
 * @Description: suanfa.class04
 * @version: 1.0
 */
public class heap01 {


    public class myMaxHeap{
        private final int limit;
        private int heapsize;
        private int[] heap;

        public myMaxHeap(int limit) {
           heap= new int[limit];
            this.limit = limit;
            heapsize=0;
        }

        public int pop(){
            int ans=heap[0];
            swap(heap,0,--heapsize);
            heapify(heap,0,heapsize);
            return ans;
        }
//在之前的堆上进行再次排序
        private void heapify(int[] arr, int index, int heapsize) {
            int left=index*2+1;
            while (left<heapsize){
                int largest=left+1<heapsize&&arr[left+1]>arr[left]?left+1:left;
                largest=arr[largest]>arr[index]?largest:index;
                if (largest==index){
                    break;
                }
                swap(arr,largest,index);
                index=largest;
                left=index*2+1;
            }

        }
// 把最后以为替换到根节点
        private void swap(int[] arr, int i, int i1) {
            int tmp=arr[i];
            arr[i]=arr[i1];
            arr[i1]=tmp;
        }


    }

}
