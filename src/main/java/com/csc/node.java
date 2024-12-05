package com.csc;

public class node {
    node left, right;

    public node(Squirrel name) {
    }

    public void insertleft(Squirrel travel) {
        if (left == null)
            left = new node(travel);
        else
            left.insertleft(travel);

    }

    public void insertright(Squirrel travel) {
        if (right == null)
            right = new node(travel);
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