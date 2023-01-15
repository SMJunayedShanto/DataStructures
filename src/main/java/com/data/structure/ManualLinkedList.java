/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.data.structure;

/**
 *
 * @author User
 */
public class ManualLinkedList {
    Node top;
    
     void push(int d){
         Node old = new Node(d);
         old.next = top;
         top = old;
    }
     
     void pop(ManualLinkedList manualLinkedList){
         Node prev = manualLinkedList.top.next;
         manualLinkedList.top = null;
     }
     
     public static void main(String[] args) {
        ManualLinkedList linkedList = new ManualLinkedList();
        
        linkedList.push(10);
        linkedList.push(20000);
        linkedList.push(1000000);
        
         System.out.println(linkedList.top.next.data);
         
         linkedList.pop(linkedList);
         
         //System.out.println(linkedList.top.data);
    }
}

class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
