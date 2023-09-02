package Model.EventItem;

import java.util.Random;

public abstract class ModelToy {
    private static long idCount;
    private String title;
    private long id;

    static {
        idCount = 1;
    }

    public ModelToy(String title) {
        this.title = title;
        this.id = idCount++;
    }

    public ModelToy(String title, long id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }
}
