package com.csc;

public class node<T> {
    
    node<T> left, right;

    public node(T name) {
    }

    public void insertleft(T travel) {
        if (left == null)
            left = new node<>(travel);
        else
            left.insertleft(travel);

    }

    public  void insertright(T travel) {
        if (right == null)
            right = new node<>(travel);
        else
            right.insertright(travel);
    }

    public String retreiveleft() {
        if (left == null)
            return "null";
        return left.toString();
    }

    public String retreiveright() {
        if (right == null)
            return "null";
        return right.toString();
    }
}