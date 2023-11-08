public class MergeTwoSortedList {
    //printing all even data fist then all odd data
    public static void main(String[] args) {
LL l=new LL();
l.insertFirst(25);
l.insertFirst(23);
l.insertFirst(11);
l.insertFirst(9);
l.insertFirst(6);
l.insertFirst(1);
l.display();
System.out.println();
LL l2=new LL();
        l2.insertFirst(64);
        l2.insertFirst(39);
        l2.insertFirst(29);
        l2.insertFirst(2);
    l2.display();
        System.out.println();
LL mergeLL=new LL();
 mergeLL=mergeLL.mergeInSortedFrom(l.head,l2.head);
 mergeLL.display();
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
  void insertLast(int d){
      Node n=new Node(d);
     Node temp=head;
     if(head==null){
         head=n;
         return;
     }
      while(temp.getNext()!=null){
          temp=temp.getNext();
      }
      temp.setNext(n);
  }
LL mergeInSortedFrom(Node l1,Node l2){
     LL ans=new LL();
     Node a=l1;
     Node b=l2;
     while(a!=null&&b!=null){
         if(a.getData()<b.getData()){
             ans.insertLast(a.getData());
             a=a.getNext();
         }else{
             ans.insertLast(b.getData());
             b=b.getNext();
         }
     }
     while(a!=null){
         ans.insertLast(a.getData());
         a=a.getNext();
     }
    while(b!=null){
        ans.insertLast(b.getData());
        b=b.getNext();
    }

     return ans;
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