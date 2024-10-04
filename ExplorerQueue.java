// Coding Challenge 4: The Queue of Explorers
// Class representing an explorer in the queue
class Explorer {
    private String name;

    public Explorer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Class representing a "circular" queue of explorers
public class ExplorerQueue {
    private Explorer[] queue;
    private int front, rear, size;
    
    // Initialising 
    public ExplorerQueue(int capacity) {
        queue = new Explorer[capacity];
        front = rear = size = 0;
    }

    // Enqueue a new explorer
    public void enqueueExplorer(Explorer explorer) {
        if (size == queue.length) {
            System.out.println("Queue is full.");
        } else {
            queue[rear] = explorer;
            rear = (rear + 1) % queue.length;
            size++;
        }
    }

    // Dequeue an explorer
    public void dequeueExplorer() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            queue[front] = null;
            front = (front + 1) % queue.length;
            size--;
        }
    }

    // Display the next explorer in line
    public Explorer nextExplorer() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return null;
        }
        return queue[front];
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == queue.length;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }
}
