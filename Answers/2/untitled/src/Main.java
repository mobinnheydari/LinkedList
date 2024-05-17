import java.util.Scanner;

public class Main {

    public static void insert(List list, Element element) {
        CellType newNode = new CellType();
        newNode.Data = element;
        if (list.head == null) {
            newNode.Next = list.head;
            list.head = newNode;
        } else {
            CellType current = list.head;
            while (current.Next != null) {
                current = current.Next;
            }
            current.Next = newNode;
        }
    }

public static void insertinback(List list,Element x){
Position position=new Position();
    Position q=new Position();

        CellType node= new CellType();
node.Data=x;
        position.cell=list.head;
        while (position.cell!=null){
            q.cell=position.cell;
            position.cell=position.cell.Next;
        }
        q.cell.Next=node;
node.Next=null;
}


    public static void main(String[] args) {
        List myList = new List();
        Position myPosition = new Position();
        Element myElement1 = new Element(10);
        Element myElement2 = new Element(20);
        insert(myList, myElement1);
        insert(myList, myElement2);
        myList.printList();
        Element myElement3 = new Element(30);
insertinback(myList,myElement3);
myList.printList();
    }
}