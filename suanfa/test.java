package suanfa;

/**
 * @Auther: ttliu
 * @Date: 2021/5/18 - 05 - 18 - 14:09
 * @Description: suanfac    一个数组中有两种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这两种数
 * 整体思路是首先  所有的项异或后结果  eor只剩   两个奇数项的异或   然后找出最右侧第一个1
 * 由于两个数一定是不一样的  所以一定存在二进制的位数不同的位置   所以把所有数以第一个为1位置是否位1
 * 来作为分组    假如这个位置是第八位的  所有的数与最右侧第一个1进行与运算  如果结果为1  则是代表此位置是1
 * 因此分组进入  后这个组所有的值进行异或运算 会得出其中一个奇数项   然后与eor进行异或得出另一个奇数项
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,2,2,3,3,4,45,1,2};
        test t = new test();
        t.getMembers(arr);

    }
    public void getMembers(int[] arr){
        //首先提出仅剩的两个奇数的数   a和b
        int eor=0;
        for (int i=0;i<arr.length;i++){
            eor^=arr[i];//最后eor= a^b
        }
        int rightone=eor&((~eor)+1);  //提取  最右侧的1
        int onlyone=0;//这个相当于eor‘   用于承载其中的一个奇数项
        for(int j=0;j<arr.length;j++){
            if((arr[j]&rightone)!=0){//与后不为零代表第八位是1
                onlyone^=arr[j];//xun循环后只剩其中一个奇数次的数字
                          }
        }
        System.out.println("其中一个是"+onlyone+"另一个是"+(eor^onlyone));
    }
}
