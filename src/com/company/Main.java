package com.company;

public class Main {

    public static void main(String[] args) {

	    System.out.println("Hello World");

        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println("Before removing");
        System.out.println("Is Stack full - "+ s.isFull());
        System.out.println("Is Stack Empty - "+s.isEmpty());
        System.out.println("Peek from Stack "+s.peek() );
        System.out.println("Peek from Stack "+s.peek() );
        System.out.println("After removing");
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println("Is Stack full - "+ s.isFull());
        System.out.println("Is Stack Empty - "+s.isEmpty());


    }
}
