package baseee;

/**
 * @Auther: ttliu
 * @Date: 2021/4/22 - 04 - 22 - 10:26
 * @Description: baseee
 * @version: 1.0
 */
public class StringTest {

    public static void main(String[] args) {
        StringBuffer SBF=new StringBuffer();
        StringBuilder SBD=new StringBuilder("AAAAAA");
        System.out.println(System.identityHashCode(SBD));
        SBD.append("HHHHhhhh哈哈哈");
        System.out.println(System.identityHashCode(SBD));
        System.out.println(SBD);
        System.out.println(SBD.delete(2,4));
        System.out.println(SBD);
        System.out.println(SBD.insert(3,"ss"));
        System.out.println(SBD.replace(1,2,"q"));
        SBD.setCharAt(7,'!');
        System.out.println(SBD);
        String s = SBD.substring(1, 5);
        System.out.println(s+"截取不影响stringBuffer");
        System.out.println(SBD);

        String a="aaaaa";
        System.out.println(System.identityHashCode(a)+"first");
        String b=a+"sss";
        a= "cocci";
        System.out.println(System.identityHashCode(a)+"second");

//        String s1=  new String();
//        String s2= new String(" abc ");
//        String s3= new String("abc ");
//        String s4=new String(new char[]{'a','b','c'});
//        System.out.println(s4);
//        System.out.println(s4.charAt(1));
//        System.out.println(s4.equals(s2));
 //       System.out.println(s1.compareTo(s2));
//        System.out.println(s2==s3);
 //       System.out.println(s2.equals(s3));
//        System.out.println(s3.charAt(1));
//        System.out.println(s3.substring(3));
//        System.out.println(s3.substring(0,2));
//        System.out.println(s3.replace("a","c"));
//        String s5="asdghdvsd";
//        System.out.println(s5.concat("pp"));
//        String[] split = s5.split("d");
//        System.out.println(Arrays.toString(split));
//        System.out.println(s1.trim());
//        System.out.println(s2.trim());
//        System.out.println(s5.toUpperCase());
//        System.out.println(split);

    }


}
