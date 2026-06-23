package dev.junio.stack;

public interface Stack<T> {

    void push(T element);    // Insere um elemento no topo da pilha.
    T pop();                // Remove e retorna o elemento que está no topo da pilha.
    T peek();               // Retorna, sem remover, o elemento do topo.

    int size();
    boolean isEmpty();
    void clear();
}
