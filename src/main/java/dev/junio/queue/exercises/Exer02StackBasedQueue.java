package dev.junio.queue.exercises;

import dev.junio.queue.Queue;
import dev.junio.stack.Stack;
import dev.junio.stack.linkedstack.LinkedStack;

public class Exer02StackBasedQueue<T>  {

    private Stack<T> pilhaEntrada = new LinkedStack<>();
    private Stack<T> pilhaSaida = new LinkedStack<>();

    public void push(T element) {
        pilhaEntrada.push(element);
    }

    public T pop(){
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        if(pilhaSaida.isEmpty()){
            while (!pilhaEntrada.isEmpty()){
                pilhaSaida.push(pilhaEntrada.pop());
            }
        }
        return pilhaSaida.pop();

    }

    public T peek(){
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        if(pilhaSaida.isEmpty()){
            while (!pilhaEntrada.isEmpty()){
                pilhaSaida.push(pilhaEntrada.pop());
            }
        }
        return pilhaSaida.peek();

    }


    public boolean isEmpty() {
        return pilhaEntrada.isEmpty() && pilhaSaida.isEmpty();
    }

    public int size() {
        return pilhaEntrada.size() + pilhaSaida.size();
    }

    public void clear() {
        pilhaEntrada.clear();
        pilhaSaida.clear();
    }


    public void display() {
        System.out.println("Tamanho atual: " + size());
    }


    public Integer back() {
        return null;
    }
}
