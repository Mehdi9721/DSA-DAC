public class CIrcularListOnUserDefineClass {
    public static void main(String[] args) {
        Student s1=new Student(1,"Harry");
        Student s2=new Student(2,"Kevin");
        Student s3=new Student(3,"David");
        Student s4=new Student(4,"Mark");
        circularLL cll=new circularLL();
        cll.insertFirst(s1);
        cll.insertFirst(s2);
        cll.insertFirst(s3);
        cll.insertFirst(s4);
cll.display();
    }
}
class Student{
    private int id;
    private String name;
   public Student(){
        id=0;
        name="";
    }
   public Student(int d,String n){
        id=d;
        name=n;
    }
    public String toString(){
        return id+" "+name;
    }
}

//you can create multiple functions on your need
class circularLL{
    CLLNode head;
    void insertFirst(Student d){
  CLLNode n=new CLLNode(d);
  if(head==null){
      head=n;
      head.setNext(n);
      return;
  }
  n.setNext(head.getNext());
  head.setNext(n);
    }
    void display(){
        //using slow and fast pointer because cycle is present
        CLLNode slow=head.getNext(),fast=head;
        while(true){
            System.out.print(slow.getData()+"->");
            if(slow==fast){
                break;
            }
        slow=slow.getNext();
        }
        }

}

 class CLLNode {
    private Student data;
    private CLLNode next;
    CLLNode(){
        data=null;
        next=null;
    }
    CLLNode(Student d){
        data=d;
        next=null;
    }

    public CLLNode getNext() {
        return next;
    }

    public void setNext(CLLNode next) {
        this.next = next;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }
}