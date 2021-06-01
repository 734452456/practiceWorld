package suanfa.class02;

/**
 * @Auther: ttliu
 * @Date: 2021/5/19 - 05 - 19 - 15:37
 * @Description: suanfa.class02
 * @version: 1.0
 */
public class getMax {
    public int getMax(int[] arr){
        return process(arr,0,arr.length-1);

    }

    private int process(int[] arr, int l, int r) {
        int mid=l+((r-l)>>1);
        int leftM = process(arr, l, mid);
        int rightM = process(arr, mid + 1, r);
        return Math.max(leftM,rightM);
    }

}
