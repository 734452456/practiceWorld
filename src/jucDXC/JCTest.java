package jucDXC;

public class JCTest {
    private int a;
    private int b;
    public void give(int c,int d){
     this.a=c;
     this.b=d;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

class son1 extends JCTest{
    int c=10;
    int d=20;

/*    @Override
    public void give(int c,int d) {
        super.give(c, d);
        System.out.println(c);
        System.out.println(d);
    }*/

    public static void main(String[] args) {
        son1 son1=new son1();
        son1.give(son1.c, son1.d);
        System.out.println("sadfsafasfa\nasfafafasfasf"); //   \n 换下一行啊
        System.out.println("asfasfasfasf\tsadasfasf");  // \t   一个制表符位置
    }
}
