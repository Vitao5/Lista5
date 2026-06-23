package dev.junio.queue.exercises;

import dev.junio.queue.linkedqueue.LinkedQueue;

public class Exer05MergeQueues {
    public static LinkedQueue<Integer> mergeTwoQueues(LinkedQueue<Integer> q1, LinkedQueue<Integer> q2) {
        LinkedQueue<Integer> resultado = new LinkedQueue<>();


        while (!q1.isEmpty() && !q2.isEmpty()) {

            int valorQ1 = q1.peek();
            int valorQ2 = q2.peek();


            if (valorQ1 <= valorQ2) {
                resultado.push(q1.pop());
            } else {

                resultado.push(q2.pop());
            }
        }


        while (!q1.isEmpty()) {
            resultado.push(q1.pop());
        }


        while (!q2.isEmpty()) {
            resultado.push(q2.pop());
        }


        return resultado;
    }

    }
