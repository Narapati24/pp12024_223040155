package pertemuan5;

public class StrukturList {
    public Node HEAD;

    public void addHead(double data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }


    public void addTail(double data){
        Node posNode = null, curNode, newNode;
        newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                    posNode = curNode;
                    curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void addMid(double data, int position){
        Node newNode, posNode = null, curNode;
        int i;
        newNode = new Node(data);
        if (HEAD == null){
            HEAD = newNode;
        } else {
            curNode = HEAD;
            if (position == 1){
                newNode.setNext(curNode);
                HEAD = newNode;
            } else {
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    public void removeMid(int e){
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean ketemu;

        if (HEAD == null){
            System.out.println("Element list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;
            while (tempNode.getNext() != null && !ketemu)
            {
                if (tempNode.getData() == e){
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }
            if (ketemu)
            {
                if (i==1){
                    HEAD = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                }
            }
        }
    }

    public void displayElement(){
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
}
