public class EvenOddLinkedList {
    //printing all even data fist then all odd data
    public static void main(String[] args) {
LL l=new LL();
l.insertFirst(1);
l.insertFirst(2);
l.insertFirst(3);
l.insertFirst(4);
l.insertFirst(5);
l.insertFirst(6);
l.display();
l.convertToEvenOdd();
System.out.println();
l.display();
    }
}
class LL{
  Node head;
  void insertFirst(int s){
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
  void convertToEvenOdd(){
  Node ans=new Node();
  convertToEvenOdd(head,ans);
  head=ans.getNext();
  }
 private void convertToEvenOdd(Node head,Node ans){
Node itr=head;
while(itr!=null){
    if(itr.getData()%2==0){
ans.setNext(new Node(itr.getData()));
ans=ans.getNext();
    }
    itr=itr.getNext();
}
     itr=head;
     while(itr!=null){
         if(itr.getData()%2!=0){
             ans.setNext(new Node(itr.getData()));
             ans=ans.getNext();
         }
         itr=itr.getNext();
     }
    }

}
class Node{
    private Node next;
   private   int data;
    Node(){
        next=null;
        data=0;
    }
    Node(int data){
        next=null;
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}