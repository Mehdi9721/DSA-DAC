import java.awt.dnd.DragGestureEvent;

public class ADTLinkedListforStudent {
    public static void main(String[] args) {
        Student s1= new Student(1,"Mark");
        Student s2= new Student(2,"David");
        Student s3= new Student(4,"Allen");
LL l=new LL();
l.insertFirst(s1);
        l.insertFirst(s2);
        l.insertFirst(s3);
l.display();
    }
}
class LL{
  Node head;
  void insertFirst(Student s){
      Node n=new Node(s);
      if(head==null){
          head=n;
          return;
      }
      n.setNext(head);
      head=n;
  }
  void display(){
      Node temp= head;
      while (temp!=null){
          System.out.print(temp.getData()+ "->" );
          temp=temp.getNext();
      }
  }
}
class Node{
    private Node next;
   private   Student data;
    Node(){
        next=null;
        data=null;
    }
    Node(Student data){
        next=null;
        this.data=data;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
class Student{
    private int id;
    private String name;
    Student(){
        id=0;
        name=null;
    }
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" "+name;
    }
}