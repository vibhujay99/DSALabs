package com.company;

public class Queue {
    int capacity = 5;
    int arr[] = null;
    int front = 0;
    int rear = -1;

    public  Queue(){
        this.arr = new int[capacity];
    }

    public Queue(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is Full");
            return;
        }
        rear = rear+1;
        arr[rear] = data;
        System.out.println(data+" added into the Queue");
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int data = arr[front];
        for (int i=front;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        System.out.println(data+" dequeued from Queue");
    }

    public int rear(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return arr[rear];
    }

    public int front(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return arr[front];
    }

    public boolean isFull(){
        return size()==capacity;
    }
    public boolean isEmpty(){
        return size()==front;
    }

    public int size(){
        return rear+1;
    }

}
