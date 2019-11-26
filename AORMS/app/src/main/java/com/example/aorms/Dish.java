
package com.example.aorms;


public class Dish {
    int dish_id
    String dish_name;
    String type;
    int price;
    int time;

    public Dish() {
    }

    public Dish(int dishid,String dish_name, String type, int price, int time) {
        this.dish_id = dishid;
        this.dish_name = dish_name;
        this.type = type;
        this.price = price;
        this.time = time;
    }
    public int getDish_id() {
        return dish_id;
    }

    public void setDish_id(int dish_id) {
        this.dish_id = dish_id;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
