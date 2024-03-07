package pertemuan5;

public class StrukturListTest {
    public static void main(String[] args) {
//        Remove Head
        StrukturList listH = new StrukturList();
        listH.addTail(2);
        listH.addTail(9);
        listH.addTail(7);
        listH.displayElement();

        listH.removeHead();
        listH.displayElement();
        System.out.println();

//        Remove Tail
        StrukturList listT = new StrukturList();
        listT.addTail(2);
        listT.addTail(6);
        listT.addTail(3);
        listT.addTail(5);
        listT.addTail(1);
        listT.displayElement();

        listT.removeTail();
        listT.displayElement();

        listT.removeHead();
        listT.displayElement();
        System.out.println();


//        Remove Mid
        StrukturList listM = new StrukturList();

        listM.addTail(3);
        listM.addHead(2);
        listM.addTail(5);
        listM.addMid(6, 2);
        listM.addTail(1);

        listM.displayElement();

        listM.removeMid(3);
        listM.displayElement();

        listM.removeMid(5);
        listM.removeMid(6);
        listM.displayElement();
    }
}
