package com.bhaweshkumar.list.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}
