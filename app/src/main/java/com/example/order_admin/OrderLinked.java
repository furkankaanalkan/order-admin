package com.example.order_admin;

public class OrderLinked {

    OrderNode head;
    OrderNode tail;

    public OrderLinked(){
        head = null;
        tail = null;
    }

    // adding item to linked list
    public void add(String name , String food , String extra){
        OrderNode newOrder = new OrderNode(name,food,extra);

        if (head == null){
            head = newOrder;
            tail = newOrder;
            return;
        }
        else {
            newOrder.prev = tail;
            tail.next = newOrder;
            tail = newOrder;
        }
    }
    public void add(String name , String food){
        OrderNode newOrder = new OrderNode(name,food);

        if (head == null){
            head = newOrder;
            tail = newOrder;
            return;
        }
        else {
            newOrder.prev = tail;
            tail.next = newOrder;
            tail = newOrder;
        }
    }



}
