/*
                                         LAB-6
Write a Java program to implement a dynamic, growable queue using generics. The queue should be
able to store elements of any data type and dynamically resize itself as needed to accommodate more
elements.*/



import java.util.LinkedList;

class GQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        if (!queue.isEmpty()) {
            return queue.removeFirst();
        }
        return null; // or throw an exception
    }

    public void display() {
        for (T element : queue) {
            System.out.println(element);
        }
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        // Create a GrowableQueue of integers
        GQueue<Integer> integerQueue = new GQueue<>();
        // Enqueue elements
        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);
        System.out.println("Elements in the queue are:");
        integerQueue.display();
        // Dequeue an element
        Integer dequeuedElement = integerQueue.dequeue();
        System.out.println("Dequeued element: " + dequeuedElement);
        // Display size of the queue
        System.out.println("Queue size: " + integerQueue.size());
    }
}
