package queues;

public interface queue_i {
    public static final int size = 1000;
    abstract void enqueue(int key);
    abstract int dequeue();
    abstract int front();
    abstract int rear();
}
