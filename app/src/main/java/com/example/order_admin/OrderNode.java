package com.example.order_admin;

public class OrderNode {
    String name;
    String food;
    String extra;
    OrderNode next;
    OrderNode prev;

    public OrderNode (String name , String food , String extra){

        this.name = name;
        this.food = food;
        this.extra = extra;
        this.next = null;
        this.prev = null;

    }

    public OrderNode (String name , String food){

        this.name = name;
        this.food = food;
        this.next = null;
        this.prev = null;

    }
}
