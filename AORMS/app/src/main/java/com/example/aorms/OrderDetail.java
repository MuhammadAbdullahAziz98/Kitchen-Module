package com.example.aorms;

public class OrderDetail {
    int order_id;
    int dish_id;
    int dish_amount;
    String order_type;
    int priority;
    String dish_status;
    int dish_prep_time;

    public OrderDetail(int order_id, int dish_id, int dish_amount, String order_type, int priority, String dish_status, int dish_prep_time) {
        this.order_id = order_id;
        this.dish_id = dish_id;
        this.dish_amount = dish_amount;
        this.order_type = order_type;
        this.priority = priority;
        this.dish_status = dish_status;
        this.dish_prep_time = dish_prep_time;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getDish_id() {
        return dish_id;
    }

    public void setDish_id(int dish_id) {
        this.dish_id = dish_id;
    }

    public int getDish_amount() {
        return dish_amount;
    }

    public void setDish_amount(int dish_amount) {
        this.dish_amount = dish_amount;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDish_status() {
        return dish_status;
    }

    public void setDish_status(String dish_status) {
        this.dish_status = dish_status;
    }

    public int getDish_prep_time() {
        return dish_prep_time;
    }

    public void setDish_prep_time(int dish_prep_time) {
        this.dish_prep_time = dish_prep_time;
    }
}