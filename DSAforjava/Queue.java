public class Queue {
    public static void main(String args[]){
        queuee queue = new queuee();
        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(3);
        queue.enqueue(3);

        // System.out.println("Dequeue: "+queue.dequeue());
        System.out.println("Dequeue: "+queue.dequeue());

        queue.show();

    }
     
}
