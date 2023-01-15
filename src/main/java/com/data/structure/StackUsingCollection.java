/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.data.structure;

/**
 *
 * @author User
 */
import java.util.Stack;
public class StackUsingCollection {
    
    public static void printStack(Stack<String>stack) {
        for (int i = 0; i <= stack.size()-1; i++) {
          System.out.println(stack.get(i));
        }
      }
    
    public static void main(String[] args) {
        
        // create a stack
        Stack<String> strStack = new Stack<>();
        
        strStack.push("shanto");
        strStack.push("abdur rahim");
        
        printStack(strStack);
        
        System.out.println(strStack.search("shanto"));
        
        System.out.println(strStack.peek());
        
        strStack.pop();
        
        printStack(strStack);
        
        System.out.println("Is the stack empty? " + strStack.empty());
    }
}
