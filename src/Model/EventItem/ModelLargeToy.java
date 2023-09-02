package Model.EventItem;

public class ModelLargeToy extends ModelToy {
    private String size;

    public ModelLargeToy(String title) {
        super(title);
        this.size = "большой";
    }

    public ModelLargeToy(String title, long id) {
        super(title, id);
        this.size = "большой";
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("id:%d;title:%s;size:%s", super.getId(), super.getTitle(), this.getSize());
    }
}
