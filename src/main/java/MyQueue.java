public class MyQueue {
    private long[] a;
    private int size;
    private int nIteams;
    private int front;
    private int rear;

    public MyQueue(int maxSize){
        this.size = maxSize;
        a = new long[size];
        front = 0;
        nIteams = 0;
        rear = -1;
    }

    //добавить одну
    public void add(long value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear = ++rear % size;
        a[rear] = value;
        nIteams ++;
    }

    public long remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }
        nIteams --;
        front = front % size;
        return a[front++];
    }

    public long peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }
        return a[front];
    }

    public void display(){
        System.out.print("[");
        int item = front;
        for (int i = 0; i < nIteams; i++) {
            System.out.print(a[item++ % size]);
            if(i != nIteams-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public boolean isFull(){
        return (nIteams == size);
    }

    public boolean isEmpty(){
        return (nIteams == 0);
    }

    public int size(){
        return nIteams;
    }
}
