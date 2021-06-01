package baseee;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTest {
     private  String delELe(int[] arr,int message){
         int index=999;
        String mess="";
           for (int i=0;i<=arr.length-1;i++){
               if (arr[i]==message){
                   index=i;
                   for(int j=index;j<= arr.length-2;j++){
                       arr[j]=arr[j+1];
                   }
                   arr[arr.length-1]=0;
                   Arrays.sort(arr);
                   System.out.println("删除后的数组"+Arrays.toString(arr));
                   System.out.println(Arrays.binarySearch(arr,1));
                   Arrays.fill(arr,12);
                   System.out.println(Arrays.toString(arr));

               }
           }
           if (index!=999){
               mess="成功删除第"+(index+1)+"个元素："+message;
           }else {
               mess="没有对应元素";
           }
        return mess;


    }


    public static void main(String[] args) {
        int[] arr= {1,2,2,3,4,5,68,8};
        System.out.println(Arrays.toString(arr));
        System.out.println("请输入要删除元素");
        Scanner sc = new Scanner(System.in);
        int message = sc.nextInt();
        String getmessage = new ArraysTest().delELe(arr, message);
        System.out.println(getmessage);




    }




}
