package dev.junio.queue.exercises;

import dev.junio.queue.linkedqueue.LinkedQueue;

public class Exer06SplitEvenOdd {
    public static class Result {
        public LinkedQueue<Integer> evenQueue; // Fila de pares
        public LinkedQueue<Integer> oddQueue;  // Fila de ímpares

        public Result() {
            this.evenQueue = new LinkedQueue<>();
            this.oddQueue = new LinkedQueue<>();
        }
    }



    public static Result splitEvenOdd(LinkedQueue<Integer> original) {


        Result resultado = new Result();


        while (!original.isEmpty()) {
            Integer elemento = original.pop();


            if (elemento % 2 == 0) {
                // Se for 0, é par (even)
                resultado.evenQueue.push(elemento);
            } else {

                resultado.oddQueue.push(elemento);
            }
        }


        return resultado;
    }

}
