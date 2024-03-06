package pertemuan5;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(3);
        list.addHead(2);
        list.addTail(5);
        list.addMid(6, 2);
        list.addTail(1);

        list.displayElement();

        list.removeMid(3);
        list.displayElement();

        list.removeMid(5);
        list.removeMid(6);
        list.displayElement();
    }
}
