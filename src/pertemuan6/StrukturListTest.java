package pertemuan6;

public class StrukturListTest {
    public static void main(String[] args) {
//        Latihan 2
        StrukturList list1 = new StrukturList();
        list1.addTail(5);
        list1.addTail(4);
        list1.addTail(6);
        list1.displayElement();
        list1.find(6);

//        Latihan 4
        StrukturList list2 = new StrukturList();
        list2.addTail(7);
        list2.addTail(6);
        list2.addTail(4);
        list2.addTail(2);
        list2.addTail(3);
        list2.displayElement();
        list2.size();

//        Tugas
        StrukturList list3 = new StrukturList();
        list3.addTail(4);
        list3.addTail(3);
        list3.addTail(7);
        list3.addTail(8);
        list3.addTail(1);
        list3.addTail(9);
        list3.displayElement();
        list3.removeAll();
        list3.displayElement();

    }
}
