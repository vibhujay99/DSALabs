package com.company;

public class Stack {

    private int arr[]  = null;
    private int capacity = 5;
    private int top = -1;


    public Stack(){
        this.arr = new int[capacity];
    }

    public Stack(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public void push(int data){
        if (isFull()){
            System.out.println("Stack is Full");
            return;
        }
        top = top +1;
        arr[top] = data;
        System.out.println(data+ " inserted into stack");
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }
        int data = arr[top];
        return data;
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        int data  = arr[top];
        top = top-1;
        System.out.println(data+ " removed from Stack");
    }

    public boolean isFull(){
        return size() == capacity;
    }
    public boolean isEmpty(){
        return (top==-1);
    }

    public int size(){
        return top+1;
    }
}
