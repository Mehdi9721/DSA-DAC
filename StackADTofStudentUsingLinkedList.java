//implementing stack using array and linkedlist
class Student{
 private int id;
 private String name;
 public Student() {
        this.id =0;
        name="";
    }
    public Student(int i,String n){
 id=i;
 name=n;
    }
    public  String toString(){
     return id+" "+name;
    }
}
class MyStack{
LL l=new LL();
    //for pushing
 void push(Student d){
    l.insertLast(d);
    }
 //for pop
 Student pop(){
 return l.deleteLast();
 }

}
class LL{
    Node head;
    static private class Node{
        Node next;
        Student data;
        Node(){
            next=null;
            data=null;
        }
        Node(Student s){
data=s;
next=null;
        }

    }
    LL(){
        head=null;
    }
    void insertLast(Student s){
        Node n=new Node(s);
if(head==null){
    head=n;
    return;
}
Node itr=head;
        while(itr.next!=null){
            itr=itr.next;
        }
        itr.next=n;
    }
    Student deleteLast(){
        if(head==null){
            return null;
        }
        if(head.next==null){
            Student k=head.data;
            head=null;
return k;
        }
        Node itr=head;
        while(itr.next.next!=null){
            itr=itr.next;
        }
        Student s=itr.next.data;
        itr.next=null;
        return s;
    }
}

public class StackADTofStudentUsingLinkedList {
    public static void main(String[] args) {
        MyStack a=new MyStack();
        Student s1=new Student(1,"Allen");
        Student s2=new Student(2,"Mark");
        Student s3=new Student(3,"Kevin");
        a.pop();
        a.push(s1);
        a.push(s2);
        a.push(s3);
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());

    }
}


