import java.util.ArrayList;
import java.util.Arrays;

class Student{
    private int id;
    private String name;
    Student(){
        id=0;
        name="";
    }
    Student(int d,String na){
        id=d;
        name=na;
    }
    public String toString(){
        return id+" "+name;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

}


class SelectionAndBubbleOnArrayOfObject{
    public static void main(String[] args) {
        Student s1=new Student(2,"Allen");
        Student s2=new Student(7,"Jack");
        Student s3=new Student(1,"Duck");
        Student s4=new Student(9,"Ninja");
Student[] arr=new Student[4];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        arr[3]=s4;
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(Student[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j].getId()>arr[j+1].getId()){
                    Student temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    static void selectionSort(Student[] arr){
//selecting smallest from i
        for (int i = 0; i <arr.length-1; i++) {
            int k=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j].getId()<arr[i].getId()){
                    k=j;
                }
            }
            Student temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
    }
}
