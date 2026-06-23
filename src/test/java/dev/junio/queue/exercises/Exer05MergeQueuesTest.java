package dev.junio.queue.exercises;

import dev.junio.queue.linkedqueue.LinkedQueue;

public class Exer05MergeQueuesTest {
    public static void main(String[] args) {
        testeJuncaoOrdenada();
    }

    public static void testeJuncaoOrdenada() {
        System.out.println("\n--- [Questão 5] Teste Junção de Filas Ordenadas ---");
        LinkedQueue<Integer> q1 = new LinkedQueue<>();
        q1.push(1);
        q1.push(3);
        q1.push(5);

        LinkedQueue<Integer> q2 = new LinkedQueue<>();
        q2.push(2);
        q2.push(4);
        q2.push(6);

        System.out.print("Fila 1: "); q1.display();
        System.out.print("Fila 2: "); q2.display();

        LinkedQueue<Integer> resultado = Exer05MergeQueues.mergeTwoQueues(q1, q2);

        System.out.print("Fila Combinada e Ordenada: ");
        resultado.display(); // Deve exibir [1, 2, 3, 4, 5, 6]

        System.out.println("Fila 1 esvaziada? (Esperado true): " + q1.isEmpty());
        System.out.println("Fila 2 esvaziada? (Esperado true): " + q2.isEmpty());
    }
}