
package com.example.aorms;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

public class Dish implements Parcelable {
    String name;
    Drawable img;
    String type;
    int DishID;
    int DishCost;
    int PrepTime;
    boolean selected =false;
    int amount = 1;

    public Dish(String n, String t){
        this.name = n;
        this.type = t;
    }


    public Dish(String name, Drawable img, String type, int dishID, int dishCost, int prepTime, boolean selected, int amount) {
        this.name = name;
        this.img = img;
        this.type = type;
        DishID = dishID;
        DishCost = dishCost;
        PrepTime = prepTime;
        this.selected = selected;
        this.amount = amount;
    }



    public Dish(Parcel in) {
        name = in.readString();
        DishID = in.readInt();
        DishCost = in.readInt();
        type = in.readString();
        PrepTime = in.readInt();
        this.amount = in.readInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDishID() {
        return DishID;
    }

    public void setDishID(int dishID) {
        DishID = dishID;
    }

    public int getDishCost() {
        return DishCost;
    }

    public void setDishCost(int dishCost) {
        DishCost = dishCost;
    }

    public int getPrepTime() {
        return PrepTime;
    }

    public void setPrepTime(int prepTime) {
        PrepTime = prepTime;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static Creator<Dish> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        // TODO Auto-generated method stub
        out.writeString(name);
        out.writeInt(DishID);
        out.writeInt(DishCost);
        out.writeString(type);
        out.writeInt(PrepTime);
        out.writeInt(amount);

    }

    // this is used to regenerate your object. All Parcelables must have a CREATOR that implements these two methods
    public static final Creator <Dish> CREATOR = new Creator<Dish>() {
        public Dish createFromParcel(Parcel in) {
            return new Dish(in);
        }

        public Dish[] newArray(int size) {
            return new Dish[size];
        }
    };
}