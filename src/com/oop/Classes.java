package com.oop;

public class Classes {
    public static void main(String[] args){
//        Student st1 = new Student();
//        st1.marks= 85.3f;
//        st1.name="Joyboy";
//        st1.rollNo=1;
//        System.out.println(st1.marks);
//        System.out.println(st1.name);
//        System.out.println(st1.rollNo);
//        Student st2 = new Student(2,89.4f,"Zoro");
//        System.out.println(st2.name);
//        st2.greeting();
//        Student re = new Student(st1);
//        System.out.println(re.name);
//        Student std3 = new Student();
//        System.out.println(Student.count);
//        Student.count = 1;
//        st2.greeting();
        Singletone obj = Singletone.getInstance();
        Singletone obj1 = Singletone.getInstance();
        Singletone obj3 = Singletone.getInstance();
        System.out.println(obj1 == obj);
        System.out.println(obj == obj3);
    }

    }
class Student{
    int rollNo;
    String name;
    float marks;
    static int count = 0;

    Student(){

          this.rollNo=00;
          this.name="Enter Name";
          this.marks = 100.0f;
          Student.count+=1;

    }
    Student(int rollo,float marks,String nme){
        rollNo=rollo;
        name= nme;
        this.marks =  marks;
        Student.count++;
    }
    Student(Student obj){
        this.rollNo= obj.rollNo;
        this.marks = obj.marks;
        this.name= obj.name;
        Student.count++;
    }
    void greeting(){
        System.out.println("Hello Mr "+this.name);
    }

}
