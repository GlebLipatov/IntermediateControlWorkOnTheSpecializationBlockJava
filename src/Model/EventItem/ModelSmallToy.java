package Model.EventItem;

public class ModelSmallToy extends ModelToy {
    private String size;

    public ModelSmallToy(String title) {
        super(title);
        this.size = "маленький";
    }

    public ModelSmallToy(String title, long id) {
        super(title, id);
        this.size = "маленький";

    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("id:%d;title:%s;size:%s", super.getId(), super.getTitle(), this.getSize());
    }
}
