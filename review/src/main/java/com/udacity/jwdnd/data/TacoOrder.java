package com.udacity.jwdnd.data;

public class TacoOrder {
    private int orderId;
    private String tacoName;
    private Double tacoPrice;
    private int count;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getTacoName() {
        return tacoName;
    }

    public void setTacoName(String tacoName) {
        this.tacoName = tacoName;
    }

    public Double getTacoPrice() {
        return tacoPrice;
    }

    public void setTacoPrice(Double tacoPrice) {
        this.tacoPrice = tacoPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
