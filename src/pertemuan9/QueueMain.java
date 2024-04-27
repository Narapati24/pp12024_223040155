package pertemuan9;

public class QueueMain {
    public static void main(String[] args) {
        StruktureQueue queue = new StruktureQueue();
        System.out.println("### Sebelum Enqueue ###");
        System.out.println("Size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());

        for (int i = 0; i < 3; i++){
            queue.enqueue(3);
        }

        System.out.println("\n### Enqueue 3x ###");
        System.out.println("Size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Front: " + queue.front());

        queue = new StruktureQueue();

        System.out.println("\n### Sebelum Enqueue 4x ###");
        queue.displayElements();

        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println("\n### Enqueue 4x ###");
        queue.displayElements();

        queue.dequeue();
        System.out.println("\n### Dequeue 1x ###");
        queue.displayElements();
    }
}
