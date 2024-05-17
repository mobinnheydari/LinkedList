import java.util.Scanner;

public class Main {
    public static void insert(List L, Position p, Element x){
    CellType node=new CellType();
    node.Data=x;
    if(p.cell==null){
        node.Next=L.head;
        L.head=node;
    }
    else {
        node.Next = p.cell.Next;
        p.cell.Next = node;
    }
    }
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
    public static void insertfront(Element x,List list,Position p){
   CellType q=new CellType();
   q.Data=x;
        if(p.cell==null){
       q.Next=list.head;
       list.head=q;
   }
    }
    public static void main(String[] args) {
        List myList = new List();
        Position myPosition = new Position();
        Element myElement1 = new Element(10);
        Element myElement2 = new Element(20);
        Element myElement3 = new Element(30);
        insert(myList,myElement1);

        Position position=new Position();
insert(myList,myElement2);
insert(myList,myElement3);
myList.printList();
        Scanner input=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=input.nextInt();
        Element element=new Element(n);
        insertfront(element,myList,position);
        System.out.println("");
        myList.printList();
    }
}