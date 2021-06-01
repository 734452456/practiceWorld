package suanfa.class03;

/**
 * @Auther: ttliu
 * @Date: 2021/5/24 - 05 - 24 - 11:47
 * @Description: suanfa.class03
 * @version: 1.0
 */
public class samllSum {
    public static  int samllSum(int[] arr){
        if(arr.length<2||arr==null){
            return 0;
        }
        return process(arr,0,arr.length-1);

    }

    private static int process(int[] arr, int l, int r) {
        if(l==r){
            return 0;
        }
        int mid=l+((r-l)>>1);
        return process(arr,1,mid)//递归中  每一次排序也会返回其中的最小值
                +
                process(arr,mid+1,r)
                +
                merge(arr,l,mid,r);
    }

    private static int merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[r-l+1];
        int i=0;
        int p1=l;
        int p2=mid+1;
        int res=0;
        if(p1<=mid&&p2<=r){//排序过程中同时记录符合条件的值
            res+=arr[p1]<arr[p2]? (r-p2+1)*arr[p1]:0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1<=mid){
            help[i++]=arr[p1++];
        }
        while(p2<=r){
            help[i++]=arr[p2++];
        }
        for (i=0;i<help.length;i++){//所有的help中的值返回给arr  用于下一次的归并排序
            arr[l+r]=help[i];
        }
        return res;
    }
}
