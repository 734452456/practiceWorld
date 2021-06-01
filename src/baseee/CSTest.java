package baseee;
import java.lang.String;

/**
 * @Auther: ttliu
 * @Date: 2021/4/14 - 04 - 14 - 15:40
 * @Description: baseee
 * @version: 1.0
 */
public class CSTest {
    public static void main(String[] args) {
        JTTest CC = new JTTest();
        CC.id=30;
        String a = CC.getA();
        System.out.println(CC.sid+"原");
        CC.sid=34;
        System.out.println(CC.sid+"改一"+"改后id"+CC.id);
        System.out.println(System.identityHashCode(CC.sid));


        JTTest DD = new JTTest();
        String a2 = DD.getA();
        a2.equalsIgnoreCase(a);
        a2.equals(a);
;
        int id = DD.id;
        int sid=DD.sid;
        System.out.println(DD.sid+"共享sid"+"不共享的id"+id);
        System.out.println(DD.toString());
        System.out.println(System.identityHashCode(sid));
        System.out.println(System.identityHashCode(DD.sid));




        if (DD instanceof JTTest){
            System.out.println("ok");
        }





    }

    @Override
    public boolean equals(Object obj) {

        String a = (String) obj;
        if(a.length()==0){

        }
        return super.equals(obj);

    }


}
