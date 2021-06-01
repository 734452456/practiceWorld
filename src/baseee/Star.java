package baseee;

import java.io.Serializable;

public class Star implements Serializable {

    private static final long serialVersionUID = -6927011624979980192L;
   public int a;
    int b;
    private  int c;
    public void test(){
        System.out.println(a+b+"asfasfas");
    }
    public  void ook(int a){
        System.out.println(a+"jjjjjjj");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Star(int a, int b) {
        this.a = a;
        this.b = b;
    }
    private  Star(int a){
        System.out.println("hhhprivete");
    }
    public Star(){
        System.out.println("无参构造");

    }

    @Override
    public String toString() {
        return "Star{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {



        for (int x=1;x<20;x++){
            for (int y=1;y<33;y++){
                int z=100-x-y;
                if(5*x+3*y+z/3==100 && z%3==0){
                    System.out.println(x+"\t"+y+"\t"+z);
                }

            }
        }

        int size = 17;
        int startNum =size/2+1;
        int endNum=size/2+1;
        boolean flag= true; // false代表下半边
        for (int i=1;i<=size;i++){ //控制行数

            //打印空格
            for(int j=1;j<=size;j++){
                  //判断位置打印*  或者空格
                if(j==startNum || j==endNum){
                    System.out.print("*");
                }else{
                    System.out.print("@");

                }
            }
            System.out.println("");
            if(endNum==size){
                flag=false;//  鉴别是否韦倒三角
            }
            if(flag){
                startNum--;
                endNum++;
            }else {
                startNum++;
                endNum--;
            }

        }
    }
}
