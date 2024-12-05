package com.csc;

public class OakTree {

  public static void main(String[] args) {
    Squirrel chipmunk = new Squirrel("chipmunk");
    node nodeone = new node(chipmunk);
    Squirrel raccon = new Squirrel("raccon");
    Squirrel flying = new Squirrel("flying");

    Squirrel fluffy = new Squirrel("fluffy");
    node nodetwo = new node(fluffy);
    Squirrel fuzzy = new Squirrel("fuzzy");
    Squirrel puffy = new Squirrel("puffy");

    nodeone.insertleft(raccon);
    nodeone.insertright(flying);

    nodetwo.insertright(fuzzy);
    nodetwo.insertleft(puffy);

    System.out.println(nodeone.retreiveleft());
    System.out.println(nodeone.retreiveright());
    System.out.println(nodetwo.retreiveleft());
    System.out.println(nodetwo.retreiveright());

  }
}
