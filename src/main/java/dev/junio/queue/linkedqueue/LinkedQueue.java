package dev.junio.queue.linkedqueue;

import dev.junio.queue.Queue;

public class LinkedQueue<T> implements Queue<T> {

    private static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        T removedElement = head.element;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return removedElement;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return head.element;
    }

    @Override
    public T back() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return tail.element; // O ponteiro tail já aponta direto para o fim
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.element);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }
}