package Model;

public class ModelToy {
    private static long idCount;
    private long id;
    private String title;
    private int weight;

    static {
        idCount = 1;
    }

    public ModelToy(String title, int weight) {
        this.id = idCount++;
        this.title = title;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Игрушка: %s, шанс выигрыша %d", this.title, this.weight);
    }
}
