package suanfa.class03;

/**
 * @Auther: ttliu
 * @Date: 2021/5/21 - 05 - 21 - 10:42
 * @Description: suanfa.class03
 * @version: 1.0
 */
public class mergerSort {
    public static void main(String[] args) {

    }
    //递归方式
    public  static void mergeSort1(int[] arr){
        if (arr==null || arr.length<2){
            return;
        }
        process(arr,0, arr.length-1);
    }
    //非递归方式实现
    public static  void mergeSort2(int[] arr){
        if (arr==null || arr.length<2){
            return;
        }
        int N=arr.length;
        int mergeSize=1;//左边数组初始值
        while (mergeSize<N){
            int L=0;
            while(L<N){
                int M=L+mergeSize-1;//M是中间所在数组位置的下标所以要减一
                //  这里默认中间位置是左边的最后一个位置（左右两边相等的时候）
                if(M>=N){
                    break;
                }
            int R=Math.min(M+mergeSize,N-1);
            merge(arr,L,M,R);
            if(mergeSize>N/2){//大于N/2说明不能继续扩大 否则会超过原有数组大小
                break;
            }
            mergeSize <<=1;//每次排序完之后要扩大两倍  相当于把递归反过来

            }
        }
    }

    public  static void process(int[] arr,int l,int r){
        if (l==r){
            return ;
        }
       int mid= l+((r-l)>>1);
        process(arr,l,mid);
        process(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
//  进行归并排序  对有序的两个数组进行排序
    private static void merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[r - l + 1];//使用一个数组进行辅助
        int i=0;
        int  p1=l;
        int p2=mid+1;
        //出现三种不同的情况下的排序
        while(p1<=mid&&p2<=r){
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=mid){//经过第一个while后如果p1数组没有走完  直接排序进去
            help[i++]=arr[p1++];
        }
        while(p2<=r){
            help[i++]=arr[p2++];
        }
        //把排好序的help数组放回数组arr
        for (i=0;i< help.length;i++){
            arr[l+i]=help[i];
        }

    }

}
