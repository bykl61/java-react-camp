package homework1.entities.impl;

public class GameEntity extends BaseEntity{

    private double price;
    private String topic;




    public GameEntity(int id, String name, double price, String topic) {
        super(id, name);
        this.price = price;
        this.topic = topic;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
