package Model;

import java.util.LinkedList;
import java.util.Queue;

public class Event<T extends EventItem> {
    private Queue<T> queue;

    public Event() {
        this.queue = new LinkedList<>();
    }

    public boolean addItem(T item) {
        return this.queue.add((T) item);
    }

    public T getItem() {
        if (queue.isEmpty()) return null;
        else return queue.remove();
    }

    public T nextItem() {
        if (queue.isEmpty()) return null;
        else return queue.peek();
    }
}
