package h20_Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {
	public static void main(String[] args) {
        JavaIterator JavaIterator= new JavaIterator();
        JavaIterator.display();
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public int compareTo(Student stu){
        if(this.age > stu.age){
            return -1;
        }else if(this.age < stu.age){
            return 1;
        }
        return 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class JavaIterator {
    List<Student> slist=null;
    public JavaIterator(){
        Student[] stu=new Student[5];
        slist=new ArrayList<Student>();
        stu[0]=new Student("����", 32);
        stu[1]=new Student("����", 25);
        stu[2]=new Student("����", 21);
        stu[3]=new Student("����", 38);
        stu[4]=new Student("����", 26);
        for(int i=0;i<5;i++){
            slist.add(stu[i]);
        }
    }
    public void display(){
        Iterator<Student> t=slist.iterator();
        System.out.println("������õ�ԭʼ���ݣ�");
        while(t.hasNext()){
            Student student=t.next();
            System.out.println("������"+student.getName()+"����"+student.getAge()+"��");
        }
        Collections.sort(slist);
        Iterator<Student> it=slist.iterator();
        System.out.println("========================================");
        System.out.println("������Ӵ�С����");
        while(it.hasNext()){
            Student student=it.next();
            System.out.println("������"+student.getName()+"����"+student.getAge()+"��");
        }
    }

}

