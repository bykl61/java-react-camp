package homework1.entities.impl;

import java.util.Date;

public class CustomerEntity extends BaseEntity {

    private String lastName;
    private long tc;
    private Date date;

    public CustomerEntity() {
    }

    public CustomerEntity(int id, String name, String lastName, long tc, Date date) {
        super(id, name);
        this.lastName = lastName;
        this.tc = tc;
        this.date = date;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getTc() {
        return tc;
    }

    public void setTc(long tc) {
        this.tc = tc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
