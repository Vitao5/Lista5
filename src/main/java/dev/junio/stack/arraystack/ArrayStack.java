package dev.junio.stack.arraystack;

import dev.junio.stack.Stack;

public class ArrayStack<T> implements Stack<T> {

    private T[] items;
    private int count;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayStack(int size) {
        this.capacity = size;
        this.items = (T[]) new Object[capacity];
        this.count = 0;
    }

    public boolean fitsFull() { // Equivalente ao isFull()
        return count == capacity;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void push(T element) {
        if (fitsFull()) {
            System.out.println("Erro: Pilha cheia!");
            return;
        }
        items[count++] = element; // Adiciona no topo
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return null;
        }

        // Pega o elemento do topo (último inserido)
        T removedItem = items[count - 1];
        items[count - 1] = null; // Libera para o Garbage Collector
        count--;

        return removedItem;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return items[count - 1];
    }

    @Override
    public void clear() {
        for (int i = 0; i < count; i++) {
            items[i] = null;
        }
        this.count = 0;
    }

    public void display() {
        System.out.print("Pilha atual (Base -> Topo): [");
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
