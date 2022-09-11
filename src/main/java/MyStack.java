public class MyStack {
    private int[] arr;
    private int top;
    private int capacity;

    MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.exit(-1);
        }

        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.exit(-1);
        }

        return arr[top--];
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(-1);
        }

        return -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return size() == -1;
    }

    public boolean isFull() {
        return size() == capacity - 1;
    }

    public void clear() {
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(null);
    }
}
