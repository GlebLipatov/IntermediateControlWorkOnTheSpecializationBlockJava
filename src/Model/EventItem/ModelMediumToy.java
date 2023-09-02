package Model.EventItem;

public class ModelMediumToy extends ModelToy{

    private String size;

    public ModelMediumToy(String title) {
        super(title);
        this.size = "средний";
    }

    public ModelMediumToy(String title, long id) {
        super(title, id);
        this.size = "средний";
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("id:%d;title:%s;size:%s", super.getId(), super.getTitle(), this.getSize());
    }
}
