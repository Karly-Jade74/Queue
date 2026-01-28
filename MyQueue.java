import java.util.NoSuchElementException;

public class MyQueue implements IQueue {
    private Object[] data;
    private int front;
    private int rear;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyQueue() {
        data = new Object[INITIAL_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public void enqueue(Object item) {
        if (size == data.length) {
            resize();
        }
        data[rear] = item;
        rear = (rear + 1) % data.length;
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Object item = data[front];
        data[front] = null; // for garbage collection
        front = (front + 1) % data.length;
        size--;
        return item;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return data[front];
    }

    @Override
    public int indexOf(Object item) {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % data.length;
            if ((item == null && data[idx] == null) || (item != null && item.equals(data[idx]))) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        Object[] newData = new Object[data.length * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];
        }
        front = 0;
        rear = size;
        data = newData;
    }
}
import java.util.NoSuchElementException;

public class MyQueue implements IQueue {
    private Object[] data;
    private int front;
    private int rear;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyQueue() {
        data = new Object[INITIAL_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public void enqueue(Object item) {
        if (size == data.length) {
            resize();
        }
        data[rear] = item;
        rear = (rear + 1) % data.length;
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Object item = data[front];
        data[front] = null; // for garbage collection
        front = (front + 1) % data.length;
        size--;
        return item;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return data[front];
    }

    @Override
    public int indexOf(Object item) {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % data.length;
            if ((item == null && data[idx] == null) || (item != null && item.equals(data[idx]))) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        Object[] newData = new Object[data.length * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];
        }
        front = 0;
        rear = size;
        data = newData;
    }
}
