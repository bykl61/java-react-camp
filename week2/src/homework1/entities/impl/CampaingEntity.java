package homework1.entities.impl;

public class CampaingEntity extends BaseEntity{

    private double discount;

    public CampaingEntity() {
    }


    public CampaingEntity(int id, String name, double discount) {
        super(id, name);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
