import java.util.Scanner;

public class Person {
    String name;
    String gender;

    Person(){
        Scanner sc = new Scanner(System.in);
        name=sc.next();
        gender=sc.next();
    }
    public void m1(){
        System.out.println(name +" "+ gender);
    }
}

class Teacher extends Person {
    int salary;
    String subject;

    Teacher() {
        Scanner a = new Scanner(System.in);
        salary = a.nextInt();
        subject = a.next();
    }
    public void m3(){
        System.out.println(salary+" "+subject); super.m1();
    }
}
class Student{
    String name1;
    String gender1;

    Student(){
        Scanner s=new Scanner(System.in);
        name1=s.next();
        gender1=s.next();
    }
    public void m2(){
        System.out.println(name1+" "+gender1);
    }
}
class CollegeStudent extends Student{
    String major;
    int year;

    CollegeStudent(){
        Scanner b=new Scanner(System.in);
        major=b.next();
        year=b.nextInt();
    }

    public void m4(){
        System.out.println(major+" "+year); super.m2();
    }
}
class display{
    public static void main(String[] args) {
        Teacher obj=new Teacher();
        obj.m3();
        CollegeStudent obj1=new CollegeStudent();
        obj1.m4();
    }
}
