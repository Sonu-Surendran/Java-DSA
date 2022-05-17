package com.linkedList;

public class DLL {

    private Node head;
    private int size;
    private int count = 0;

    DLL(){
        this.size=0;
    }

    public void insert(int val,int index){
        Node node = new Node(val);
        Node temp = head;
        count = 0;
        while(count<index){
            temp = temp.next;
            count+=1;
        }
        Node prev = temp.previous;
        prev.next = node;
        node.previous = prev;
        node.next = temp;
        temp.previous = node;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = this.head;
        node.previous = null;
        if(head!=null){
            head.previous = node;
        }
        this.head = node;
        size+=1;
    }

    public int size(){
        return size;
    }

    public void display(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayReverse(){
        Node node = head;
        while(node.next!=null){
            node = node.next;
        }
        while(node!=null){
            System.out.print(node.data+" -> ");
            node = node.previous;
        }
        System.out.println("Start");
    }

   private class Node{
        private int data;
        private Node next;
        private Node previous;

        Node(int val){
            this.data = val;
        }

        Node(int val,Node next,Node previous){
            this.data = val;
            this.next = next;
            this.previous = previous;
        }
    }
}
