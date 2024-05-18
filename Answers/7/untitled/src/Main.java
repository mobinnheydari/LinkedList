import java.util.Scanner;

public class Main {

    public static void insert(List list, Element element) {
        CellType newNode = new CellType();
        newNode.Data=element;
        if (list.head == null) {
            newNode.Next = list.head;
            list.head = newNode;
        }
        else {
            CellType current = list.head;
            while (current.Next != null) {
                current = current.Next;
            }
            current.Next = newNode;
        }
    }

    public static int size(List list){
        Position position=new Position();
        int counter=0;
        while (list.head!=null){
            list.head=list.head.Next;
            counter++;
        }
return counter;
    }

    public static void main(String[] args) {
        List myList = new List();
        Position myPosition = new Position();
        Element myElement1 = new Element(10);
        Element myElement2 = new Element(20);
        Element myElement3 = new Element(30);
        insert(myList,myElement1);
        insert(myList,myElement2);
        insert(myList,myElement3);
   System.out.println("Size : "+size(myList));
    }
}