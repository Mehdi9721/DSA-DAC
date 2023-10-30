import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ArraySelf {
    private int arr[];
    ArraySelf(){
        arr=new int[5];
        Arrays.fill(arr,-1);
    }
    ArraySelf(int s){
        arr=new int[s];
        Arrays.fill(arr,-1);
    }
    void addElement(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Elements of Array \n");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }
    int sizeOfArray(){
        return arr.length;
    }
    void addElementAtIndex(int index,int val){
        if(index<1 || index >arr.length){
            System.out.println("Enter Valid index  :-)");
        }else{
            for (int i=arr.length-1;i>index-1;i--){
                arr[i]=arr[i-1];
            }
            arr[index-1]=val;
        }
    }
    void removeDuplicate(){
        HashSet<Integer> h=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            h.add(arr[i]);
        }
      Arrays.fill(arr,-1);
        int i=0;
        for(int a:h){
            arr[i]=a;
            i++;
        }
    }
    void deleteElementAtIndex() {

    }2
    void shiftArrayLeft(){
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=-1;

    }
    void shiftArrayRight(){
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=-1;
    }
    void display(){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print ("["+arr[i]+"]"+" ");
        }
        System.out.println();
    }
}

class Access{
    public static void main(String[] args) {
        ArraySelf a=new ArraySelf(5);
        Scanner sc= new Scanner(System.in);
        int x;
        while(true){
            System.out.println("Enter 1 for inserting.");
            System.out.println("Enter 2 for display.");
            System.out.println("Enter 3 for adding element at specific index.");
            System.out.println("Enter 4 to remove duplicate");
            System.out.println("Enter 5 to shift Array Left");
            System.out.println("Enter 6 to shift Array Right");
            System.out.println("Enter 0 for STOP.");

            x=sc.nextInt();
            if(x==1){
                a.addElement();
            }
            if(x==2){
                a.display();
            }
            if(x==0){
                break;
            }
            if(x==3){
                System.out.println("enter Index and value");
              int  ind=sc.nextInt();
               int val=sc.nextInt();
                a.addElementAtIndex(ind,val);
            }
            if(x==4){
                a.removeDuplicate();
            }
            if(x==5){
                a.shiftArrayLeft();
            }
            if(x==6){
                a.shiftArrayRight();
            }
        }

    }
}