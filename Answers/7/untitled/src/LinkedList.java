class Element {
    int data;

    public Element(int data) {
        this.data = data;
    }
    public String toString() {
        return String.valueOf(data);
    }
}

class CellType {
    Element Data;
    CellType Next;

}

class List {
    CellType head;
    public List() {
        head = null;
    }

    public void printList() {
        CellType current = head;
        System.out.println(current);
        while (current != null) {
            System.out.print(" "+current.Data + " "+current.Next+" ");
            current = current.Next;
        }
        System.out.println();
    }
}
class Position {
    CellType cell;
}