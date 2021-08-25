package com.company;

public class Main {

    public static void main(String[] args) {

	    System.out.println("Hello World");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");

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
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("Queue Activity");
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(28);
        q.enqueue(44);
        q.enqueue(33);
        q.enqueue(45);
        q.enqueue(34);
        System.out.println("After insertion");
        System.out.println("Rear : "+q.rear());
        System.out.println("Front : "+q.front());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
