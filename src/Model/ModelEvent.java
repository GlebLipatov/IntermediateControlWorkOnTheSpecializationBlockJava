package Model;

import java.util.LinkedList;
import java.util.Queue;

public class ModelEvent {
    private Queue<ModelToy> queue;

    public ModelEvent() {
        this.queue = new LinkedList<>();
    }

    public boolean addItem(ModelToy item) {
        return this.queue.add(item);
    }

    public ModelToy getItem() {
        if (queue.isEmpty()) return null;
        else return queue.remove();
    }

    public ModelToy nextItem() {
        if (queue.isEmpty()) return null;
        else return queue.peek();
    }
}
