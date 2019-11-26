package com.example.aorms;

import java.util.ArrayList;

public class Chef implements java.io.Serializable{

    String name;
    String specialty;
    int threshold;
    int currentWorkload;

    public Chef() {}
    public Chef(String name, String specialty, int threshold, int currentWorkload) {
        this.name = name;
        this.specialty = specialty;
        this.threshold = threshold;
        this.currentWorkload = currentWorkload;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public int getCurrentWorkload() {
        return currentWorkload;
    }

    public void setCurrentWorkload(int currentWorkload) {
        this.currentWorkload = currentWorkload;
    }
}