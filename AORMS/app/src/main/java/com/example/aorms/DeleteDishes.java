package com.example.aorms;

import java.util.List;

public class DeleteDishes {
    String orderId;
    String dishKey;

    public DeleteDishes(String orderId, String dishKey) {
        this.orderId = orderId;
        this.dishKey = dishKey;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDishKey() {
        return dishKey;
    }

    public void setDishKey(String dishKey) {
        this.dishKey = dishKey;
    }

}
