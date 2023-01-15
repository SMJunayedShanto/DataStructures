/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.data.structure;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Stack {
    
        
    //init top empty
    int top;
    String[] stack;
    //max size
    int size;
    
     // Creating a stack
  Stack(int size) {
    stack = new String[size];
    this.size = size;
    top = -1;
  }
        
    void push(String el){
        if(isFull())
            System.out.println("Stack is full!!");
        stack[++top] = el;
        printStack();
    }

    String pop(){
        if(isEmpty())
            System.err.println("Stack is Empty!!");
        return stack[top--];
    }

     boolean isFull(){
        return top == size - 1;
    }

     boolean isEmpty() {
        return top == -1;
    }
     
    private static Stack initStack(int size){
        Stack s = new Stack(size);
        return s;
    }
    
    public void printStack() {
        for (int i = 0; i <= top; i++) {
          System.out.println(stack[i]);
        }
      }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter stack size: \t");
         
        Stack stack = initStack(scan.nextInt());
        
        System.out.print("Enter an element: \t");
        stack.push("10");
        //stack.push("10");
        
        stack.pop();
         stack.pop();
        stack.printStack();
        
    }
}
