package com.sda.linkedList;

public class LinkedList {

    private static Node head;
    private static  int size;
    public LinkedList(Object data){
        head = new Node(data);
    }

    public void add(Object data){
        Node copy = head;
        head = new Node(data);
        head.next = copy;
        size++;
    }

    public static void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addTail(Object data){
        Node copy = head;
        while (copy.next != null){
            copy = copy.next;
        }

        copy.next = new Node(data);
        size++;
    }

    public Object find(int index){

        Node copy = head;
        for(int i = 0; i<index; i++){
            copy = copy.next;
        }
        return copy.getData();

    }


    class Node{

        private Object data;
        private Node next;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }


    }
}
