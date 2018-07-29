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
