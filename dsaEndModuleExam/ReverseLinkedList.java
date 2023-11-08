//reverse linked list using recursion and 3 pointers approach
public class ReverseLinkedList {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);
        list.display();
        list.reverse3pointer();
        System.out.println("After Reverse using 3 pointer ----->");
        list.display();
        list.reverseUsingrecursion();
        list.display();
    }
}
class LL{
    CLLNode head;
  public void insertFirst(int d){
      CLLNode n=new CLLNode(d);
      if(head==null){
          head=n;
          return;
      }
      n.setNext(head);
      head=n;
  }
  public void reverse3pointer(){
      CLLNode curr=head,next=null,pre=null;
      while(curr!=null){
          next=curr.getNext();
          curr.setNext(pre);
          pre=curr;
          curr=next;
      }
      head=pre;
  }
  public void reverseUsingrecursion(){
     //wrapper function for reverse
     CLLNode h=new CLLNode();
     reverseUsingrecursion(h,head);
     head=h.getNext();
  }
  private void reverseUsingrecursion(CLLNode newHead, CLLNode head){
      //best recursive approach by mehdi Not from internet...
      if(head==null){
          return;
      }
      reverseUsingrecursion(newHead,head.getNext());
      newHead.setNext(head); //just utilise the Node value while stack getting empty
      head=null;
  }
  void display(){
      CLLNode temp=head;
      while(temp!=null){
          System.out.print(temp.getData()+"->");
          temp=temp.getNext();
      }
      System.out.print("null");
      System.out.println();
  }
}
class Node{
    private int data;
    private CLLNode next;
    Node(){
        data=0;
        next=null;
    }
    Node(int d){
        data=d;
        next=null;
    }

    public CLLNode getNext() {
        return next;
    }

    public void setNext(CLLNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
