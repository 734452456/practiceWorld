package com.suanfa.class01;

/**
 * @Auther: ttliu
 * @Date: 2021/5/17 - 05 - 17 - 15:45
 * @Description: com.suanfa.class01
 * @version: 1.0
 */
public class BSAwesome {
    public static void main(String[] args) {
        int N=37;
        int count=0;
        while (N!=0){
            int eor=N&((~N)+1);
            N^=eor;
            count++;
        }
        System.out.println(count);

    }
    public  static  int getLessIndex(int[] arr){
        if (arr==null||arr.length==0){
            return -1;
        }
        if(arr.length==1||arr[0]<arr[1]){
            return 0;
        }
        if(arr[arr.length-1]<arr[arr.length-2]){
            return arr.length-1;
        }
        int left=1;
        int right=arr.length-2;
        int mid=0;
        if(left<=right){
            mid=(right+left)>>1;
            if (arr[mid]>arr[mid-1]){
                right=mid-1;
            }else if(arr[mid]>arr[mid+1]){
                left=mid+1;
            }else{
                return  mid;
            }
        }

        return left;
    }
}
