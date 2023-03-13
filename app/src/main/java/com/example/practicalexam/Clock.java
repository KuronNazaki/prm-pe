package com.example.practicalexam;

import java.io.Serializable;

public class Clock implements Serializable {
    int id;
    String name;
    int price;

    public Clock(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
