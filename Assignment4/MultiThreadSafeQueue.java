
public class MultiThreadSafeQueue implements Runnable {
    static ThreadSafeQueue tsq = new ThreadSafeQueue();

    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiThreadSafeQueue());

        t1.setName("t1");

        t1.start();
    }

    @Override
    public void run() {
        printStatus();

        tsq.add("Alice");
        tsq.add("Bruce");
        tsq.add("Cindy");
        tsq.add("David");
        tsq.add("Erica");

        printStatus();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The head of the queue now is : " + tsq.peek());

        System.out.println("'" + tsq.remove() + "' has been removed!");
        System.out.println("'" + tsq.remove() + "' has been removed!");
        System.out.println("'" + tsq.remove() + "' has been removed!");

        System.out.println("The head of the queue now is : " + tsq.peek());
        System.out.println("The empty status of the queue now is : " + tsq.isEmpty());

        System.out.println("'" + tsq.remove() + "' has been removed!");
        System.out.println("'" + tsq.remove() + "' has been removed!");

        System.out.println("The empty status of the queue now is : " + tsq.isEmpty());

    }

    public void printStatus(){
        System.out.println("Thread " + Thread.currentThread().getName() + " is working");
        if (tsq.head != null) {
            System.out.println("Head of the Queue : " + tsq.head.data);
            System.out.println("Tail of the Queue : " + tsq.tail.data);
        }
    }
}

class Node<T> {
    T data;
    Node next;
    Node prev;

    public Node(T data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class ThreadSafeQueue<T> {
    Node<T> head, tail;
    private Object lock = new Object() ;

    public ThreadSafeQueue() {
        this.head = null;
        this.tail = null;
    }

    public void add(T data) {
        // System.out.println("Trying to add " + data + " to the head of the Queue.");
        synchronized (lock) {
            Node<T> newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                System.out.println(data + " has been add at the head of the Queue.");
                return;
            }

            Node<T> prev = head.prev;

            head.prev = newNode;
            newNode.prev = prev;
            newNode.next = head;

            head = newNode;

            System.out.println(data + " has been add at the head of the Queue.");
        }
    }

    public T remove() {
        // System.out.println("Trying to remove the data in the head of the Queue.");
        synchronized (lock) {
            if (head == null) {
                return null;
            }

            Node<T> temp = head;
            if (head == tail) {
                head = null;
                tail = null;
                return temp.data;
            }

            Node<T> next = head.next;
            next.prev = head.prev;

            head = next;

            return temp.data;
        }
    }

    public T peek() {
        synchronized (lock) {
            return head.data;
        }
    }

    public boolean isEmpty() {
        synchronized (lock) {
            return head == null;
        }
    }
}
