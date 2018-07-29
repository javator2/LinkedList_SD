package com.sda.linkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList lista = new LinkedList(2);
        for (int i = 0; i < 10; i++) {
            lista.add(i);

            System.out.println(lista.find(5));
            //LinkedList.printList();
        }
    }
}
