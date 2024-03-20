package pertemuan7;

public class Node {
    private MataKuliah data;
    private Node next;
    public Node(MataKuliah data) { this.data = data; }

    public Node getNext() { return next; }

    public MataKuliah getData() { return data; }

    public void setData(MataKuliah data) { this.data = data; }

    public void setNext(Node next) { this.next = next; }
}
