package baseee;

import java.lang.reflect.*;

/**
 * @Auther: ttliu
 * @Date: 2021/5/10 - 05 - 10 - 10:12
 * @Description: baseee
 * @version: 1.0
 */
public class fsTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Star> sccc = Star.class;
        Method[] methods = sccc.getMethods();
        for (Method mm:methods
             ) {
            System.out.println(mm);

        }
        Method method = sccc.getMethod("test");
        System.out.println(method);

        Method star = sccc.getMethod("ook", int.class);
        System.out.println(star+"sssss");

        Star oo = sccc.newInstance();
        System.out.println(star.invoke(oo,2)+"mmmmmmetho");


        Field[] dfs = sccc.getDeclaredFields();
        for (Field dd:dfs
             ) {
            System.out.println(dd);

        }
        Field[] f = sccc.getFields();
        for (Field ff:f
             ) {
            System.out.println(ff);
            
        }
        Field as = sccc.getField("a");
        String name = as.getName();
        System.out.println(name);
        int modifiers = as.getModifiers();
        System.out.println(modifiers);
        System.out.println(     Modifier.toString(modifiers));
        System.out.println(Modifier.toString(as.getModifiers())+"mmmmm");



        Constructor<Star> c = sccc.getConstructor(int.class,int.class);
        System.out.println(c);

      /*  Constructor<Star> dc = sccc.getDeclaredConstructor(int.class);
        System.out.println(dc);*/

        Constructor<?>[] dcs = sccc.getDeclaredConstructors();
        for (Constructor o:dcs
             ) {
            System.out.println(o+"alll");
            
        }


        Constructor<?>[] scc = sccc.getConstructors();
        for (Constructor o:scc
             ) {
            System.out.println(o+"public");

        }
        System.out.println(scc);

        Star s1 = c.newInstance(12, 23);
        System.out.println(s1);

      /*  Star s2 = dc.newInstance(1);
        System.out.println(s2);*/


        Star s = new Star(1,2);
        Class<? extends Star> sc = s.getClass();
        System.out.println(sc);

        Class<Star> starClass = Star.class;
        System.out.println(starClass);

 /*       Class<?> ac = Class.forName("baseee.Star");
        System.out.println(ac);
        ClassLoader cl = Test.class.getClassLoader();
        Class<?> acc = cl.loadClass("baseee.Star");
        System.out.println(acc);

        Class<Integer> integerClass = int.class;
        Class<Void> voidClass = void.class;
        System.out.println(integerClass);
        System.out.println(voidClass);*/


    }
}
