public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        System.out.println("Queue empty? " + queue.isEmpty());

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println("First element (peek): " + queue.peek()); 
        System.out.println("Index of B: " + queue.indexOf("B")); 
        System.out.println("Queue size: " + queue.size()); 

        System.out.println("Dequeue: " + queue.dequeue()); 
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Queue empty? " + queue.isEmpty()); 
        System.out.println("Dequeue: " + queue.dequeue()); 
        System.out.println("Queue empty? " + queue.isEmpty()); 

        // System.out.println("Dequeue from empty: " + queue.dequeue()); 
    }
}
