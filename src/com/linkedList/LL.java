package com.linkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    LL(){
        this.size=0;
    }

    public int getSize(){
        return size;
    }

    public void insert(int index,int val){
        if(index == 0){
            insertFirst(val);
        }
        if(index == size-1) {
            insertEnd(val);
        }
        Node getNode = getNode(index);
        if(getNode.data == -1){
            return;
        }
        Node node = new Node(val,getNode.next);
        getNode.next = node;
        size+=1;
    }

    private Node getNode(int index) {
        Node temp = head;
        try {
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
        }catch (Exception e){
            System.out.println("The Index "+index+" Does not exist");
            return new Node(-1);
        }
        return temp;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;

        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void RInsert(int index,int val){
        RInsert(index,val,head);
    }

    private void RInsert(int index,int val,Node temp){
        if(index == 1){
            Node n = new Node(val);
            n.next=temp.next;
            temp.next = n;
            return;
        }
        if(index ==0){
            Node n = new Node(val);
            n.next=head;
            head=n;
            return;
        }

        RInsert(index-1,val,head.next);
    }

    public void insertEnd(int val){
        if(tail == null){
            insertFirst(val);
        }
        Node node = new Node(val);
        this.tail.next = node;
        tail = node;
        size+=1;
    }

    public int removeFirst(){
        int val = this.head.data;
        this.head = this.head.next;
        size-=1;

        return val;
    }

    public int removeEnd(){
        Node temp = getNode(size-1);
        int data = this.tail.data;
        this.tail = temp;
        this.tail.next = null;
        size-=1;

        return data;
    }

    public int remove(int index){
        Node node = getNode(index);
        int data = node.next.data;
        node.next = node.next.next;
        size-=1;
        return data;
    }

    public void display(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    class Node{
        private int data;
        private Node next;

        Node(int val){
            this.data = val;
        }

        Node(int val,Node next){
            this.data = val;
            this.next = next;
        }
    }
}
