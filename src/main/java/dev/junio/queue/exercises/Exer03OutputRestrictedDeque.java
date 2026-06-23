package dev.junio.queue.exercises;

import dev.junio.queue.arrayqueue.ArrayQueue;

public class Exer03OutputRestrictedDeque<T> extends ArrayQueue<T> {
    public Exer03OutputRestrictedDeque(int capacity) {
        super(capacity);
    }

    public T popBack() {

        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }


        T removido = (T) this.items[this.count - 1];

        this.count--;
        this.items[this.count] = null;
        return removido;
    }
}
