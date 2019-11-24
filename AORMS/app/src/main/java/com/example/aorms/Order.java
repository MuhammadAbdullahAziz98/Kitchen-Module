package com.example.aorms;

import java.util.List;
public class Order {
    int order_id;
    int ordertime;
    String status;
    int table_id;
    int dish_count;
    int order_prep_time;
    float bill;
    List<OrderDetail> OrderPlaced;

    public Order(int order_id, int ordertime, String status, int table_id, int dish_count, int order_prep_time, float bill, List<OrderDetail> orderPlaced) {
        this.order_id = order_id;
        this.ordertime = ordertime;
        this.status = status;
        this.table_id = table_id;
        this.dish_count = dish_count;
        this.order_prep_time = order_prep_time;
        this.bill = bill;
        OrderPlaced = orderPlaced;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(int ordertime) {
        this.ordertime = ordertime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public int getDish_count() {
        return dish_count;
    }

    public void setDish_count(int dish_count) {
        this.dish_count = dish_count;
    }

    public int getOrder_prep_time() {
        return order_prep_time;
    }

    public void setOrder_prep_time(int order_prep_time) {
        this.order_prep_time = order_prep_time;
    }

    public float getBill() {
        return bill;
    }

    public void setBill(float bill) {
        this.bill = bill;
    }

    public List<OrderDetail> getOrderPlaced() {
        return OrderPlaced;
    }

    public void setOrderPlaced(List<OrderDetail> orderPlaced) {
        OrderPlaced = orderPlaced;
    }
}
