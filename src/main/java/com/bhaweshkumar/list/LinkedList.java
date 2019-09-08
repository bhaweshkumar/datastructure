package com.bhaweshkumar.list;

import com.bhaweshkumar.list.model.Node;

public class LinkedList<T> {
    private static int counter;
    private Node<T> head;
    private Node<T> tail;

    /**
     * Adds to the end of linked list
     *
     * @param data: any object to be stored in linked list
     */
    public void addLast(T data) {
        if (head == null) {
            head = new Node<>(data);
            tail = head;
        } else {
            Node<T> temp = new Node<>(data);
            tail.setNext(temp);
            tail = temp;
        }
        counter++;
    }

    public void printNodes() {
        if (head != null) {
            Node<T> printer = head;
            while (printer.getNext() != null) {
                System.out.println(printer.getData());
            }
        } else {
            System.out.println("No nodes to print, linked list is empty!");
        }
    }
}
