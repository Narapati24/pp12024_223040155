package pertemuan10;

public class StruktureStack {
//    Latihan 2
    private int[] array;
    private int capacity;
    private int TOP;

    public final int MIN = -1;
    public StruktureStack(int capacity){
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }
//    Latihan 1
    public void push(int data){
        if (isFull()){
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

//    Tugas
    public void pop(){
        int temp;
        if (isEmpty()){
            System.out.println("Stak Kosong");
        } else {
            temp = array[TOP];
            TOP = TOP -1;
        }
    }

//    Latihan 3
    public boolean isEmpty(){
        return (TOP == MIN);
    }

    public boolean isFull(){
        return (TOP == (capacity - 1));
    }
    public int size(){
        return (TOP + 1);
    }
    public int getTOP(){
        return isEmpty()? TOP : array[TOP];
    }

    public void displayFromTOP(){
        int i = TOP;
        while (i > MIN){
            System.out.print(array[i] + " ");
            i--;
        }
    }

    public void displayElement(){
        System.out.println("Size: " + size());
        System.out.println("Empty: " + isEmpty());
        System.out.println("Full: " + isFull());
        System.out.println("Top: " + getTOP());
        System.out.print("Elemen from TOP: ");
        displayFromTOP();
        System.out.println();
    }
}
