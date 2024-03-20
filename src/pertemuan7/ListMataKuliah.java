package pertemuan7;

import java.util.Objects;

public class ListMataKuliah {
    public Node HEAD;

    public void addHead(MataKuliah data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }


    public void addTail(MataKuliah data){
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

    public void addMid(MataKuliah data, int position){
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

    public void removeHead(){
        if (HEAD == null){
            System.out.println("List Kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
        }
    }

    public void removeMid(MataKuliah e){
        Node preNode = new Node(e);
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
                if (Objects.equals(tempNode.getData(), e)){
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

    public void removeTail(){
        Node preNode = null, lastNode;
        if (HEAD != null){
            if (HEAD.getNext()==null){
                HEAD = null;
            } else {
                lastNode = HEAD;
                while (lastNode.getNext() != null){
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
            }
        }
    }

    public void removeAll(){
        while (HEAD != null){
            removeTail();
        }
    }

    public boolean find(MataKuliah x){
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu){
            if (curNode.getData() == x){
                ketemu = true;
            } else {
                curNode = curNode.getNext();
            }
        }

        System.out.println(ketemu);
        return ketemu;
    }

    public int size(){
        Node curNode = HEAD;
        int jumlah = 0;

        while (curNode != null){
            jumlah++;
            curNode = curNode.getNext();
        }

        System.out.println(jumlah);
        return jumlah;
    }

    public void displayElement(){
        Node curNode = HEAD;
        if (curNode != null) {
            while (curNode != null) {
                System.out.println("Matakuliah: " + curNode.getData().getKode() + ", "
                        + curNode.getData().getNama() + ", "
                        + curNode.getData().getSks());
                curNode = curNode.getNext();
            }
            System.out.println();
        } else {
            System.out.println("List Kosong");
        }
    }
}
