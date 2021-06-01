package suanfa.class03;

/**
 * @Auther: ttliu
 * @Date: 2021/5/26 - 05 - 26 - 10:37
 * @Description: suanfa.class03
 * @version: 1.0
 */
public class quickSort {//快排3.0  把arr[r]  换到随机的位置

    quickSort(){

    }

    public  static  void  quickSort3(int[] arr,int l ,int r){
        if(arr==null||arr.length<2){
            return;
        }
        process3(arr,0,arr.length-1);

    }
    public static void process3(int[] arr,int l, int r){
        if(l>=r){
            return;
        }
        swap(arr,l+(int)(Math.random()*(r-l)),r);
        int[] equalArea = nethelandsFlags(arr, l, r);
        process3(arr,l,equalArea[0]-1);
        process3(arr, arr[1]+1,r );
    }
////arr[L......R]  上玩荷兰国旗问题  以arr[R]做划分值
////<arr[R]   == arr[R]   >arr[R]   返回等于边界值
////由于是以arr[R]  为分割 所以先把arr[R]  放到大于区不受影响
    private static int[] nethelandsFlags(int[] arr, int l, int r) {
        if(l>r){
            return new int[] {-1,-1};
        }
        if(l==r){
            return  new int[] {l,r};
        }
        int less=l-1;
        int more=r;
        int index=l;
        while (index<more){
            if (arr[index]==arr[r]) {
                index++;
            }else if(arr[index]<arr[r]){
                swap(arr,index++,++less);
            }else {
                swap(arr,index,--more);
            }
        }
        swap(arr,r,more);
        return new int[]{less+1,more};
    }

    private static void swap(int[] arr, int i, int r) {
        int temp=arr[i];
        arr[i]=arr[r];
        arr[r]=temp;
    }
}
