package dev.junio.queue.arrayqueue;

import dev.junio.queue.Queue;

public class ArrayQueue<T> implements Queue<T> {
    protected Object[] items;
    protected int count;

    public ArrayQueue(int capacity) {
        this.items = new Object[capacity];
        this.count = 0;
    }

    @Override
    public void push(T element) {
        if (count >= items.length) {
            throw new IllegalStateException("Fila cheia");
        }
        items[count] = element;
        count++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        T removedElement = (T) items[0];

        // Deslocamento imediato para a esquerda
        for (int i = 1; i < count; i++) {
            items[i - 1] = items[i];
        }

        count--;
        items[count] = null; // Limpa a referência para o Garbage Collector
        return removedElement;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return (T) items[0];
    }

    @SuppressWarnings("unchecked")
    @Override
    public T back() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return (T) items[count - 1]; // O último elemento está em count - 1
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void clear() {
        this.items = new Object[items.length];
        this.count = 0;
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}