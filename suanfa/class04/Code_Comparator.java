package suanfa.class04;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: ttliu
 * @Date: 2021/6/1 - 06 - 01 - 9:13
 * @Description: suanfa.class04
 * @version: 1.0
 */

public class Code_Comparator {
    public  static  class  student{
        public String name;
        public int id ;
        public int age;

        public student(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }
    }
    public  static class  IdAscendingComparator implements Comparator<student>{

        @Override
        public int compare(student o1, student o2) {
            return o1.id-o2.id;
        }
    }


    public static void printStudents(student[] students) {
        for (student student : students) {
            System.out.println("Name : " + student.name + ", Id : " + student.id + ", Age : " + student.age);
        }
    }

    public static void main(String[] args) {
        System.out.println("========");
        student a = new student("a", 1, 20);
        student b = new student("c", 3, 90);
        student c = new student("d", 2, 23);
        student[] students = {a, b, c};
        Arrays.sort(students,new IdAscendingComparator());
       printStudents(students);
        System.out.println("``````````");


    }



}
