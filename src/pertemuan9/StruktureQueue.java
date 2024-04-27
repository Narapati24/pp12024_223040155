package pertemuan9;

public class StruktureQueue {
    private Node FRONT, REAR;
    public void enqueue(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

//    public int dequeue(){
//        Node temp;
//        int dequeueItem = Integer.MIN_VALUE;
//        if (FRONT != null){
//            if (FRONT == REAR){
//                dequeueItem = FRONT.getData();
//                FRONT = null;
//                REAR = null;
//            } else {
//                temp = FRONT;
//                dequeueItem = temp.getData();
//                FRONT = FRONT.getNext();
//            }
//        }
//        return dequeueItem;
//    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("Data Masih Kosong");
        } else {
            Node tempFRONT = FRONT;
            FRONT = FRONT.getNext();
            REAR = null;
            tempFRONT = null;
        }
    }

    public int size(){
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null){
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public void displayElements(){
        Node temp = FRONT;
        System.out.println("Size: " + size());
        System.out.println("isEmpty: " + isEmpty());
        System.out.print("ElementQueue: ");
        if (!isEmpty()){
            for (int i = 0; i < size(); i++) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
            System.out.println("\nFront: " + front());
        } else {
            System.out.println("Queue Kosong");
        }
    }

    public int front(){
        return FRONT != null ? FRONT.getData() : -1;
    }

    public boolean isEmpty(){
        return FRONT == null;
    }
}
