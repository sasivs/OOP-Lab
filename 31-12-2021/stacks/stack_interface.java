package stacks;

public interface stack_interface {
    public static final int size = 100;
    abstract void push(int key);
    abstract int pop();
    abstract int peek();
}
