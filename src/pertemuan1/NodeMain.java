package pertemuan1;

public class NodeMain {
    public static void main(String[] args) {

        // Membuat 2 buah node n1 & n2
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        Node n4 = new Node(8);

        // Membuat relasi Node n1 & n2
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        // Menampilkan Node n1 & n2 dengan Pointer p
        Node p = n1;
        while (p != null){
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }

        System.out.println();

        Node n5 = new Node(2);
        Node n6 = new Node(3);
        Node n7 = new Node(5);
        Node n8 = new Node(7);
        Node n9 = new Node(9);

        n5.setNext(n6);
        n6.setNext(n7);
        n7.setNext(n8);
        n8.setNext(n9);

        Node i = n5;
        while (i != null){
            System.out.printf("%d ", i.getNilai());
            i = i.getNext();
        }
    }
}
