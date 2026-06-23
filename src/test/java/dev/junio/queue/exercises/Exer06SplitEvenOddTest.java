package dev.junio.queue.exercises;

import dev.junio.queue.linkedqueue.LinkedQueue;

public class Exer06SplitEvenOddTest {
    public static void main(String[] args) {
        testeSeparacaoParImpar();
    }

    public static void testeSeparacaoParImpar() {
        System.out.println("\n--- [Questão 6] Teste Separação Par e Ímpar ---");
        LinkedQueue<Integer> original = new LinkedQueue<>();
        original.push(1);
        original.push(4);
        original.push(3);
        original.push(2);

        System.out.print("Fila Original: ");
        original.display();

        Exer06SplitEvenOdd.Result resultado = Exer06SplitEvenOdd.splitEvenOdd(original);

        System.out.print("Nova Fila de Pares (Esperado [4, 2]): ");
        resultado.evenQueue.display();

        System.out.print("Nova Fila de Ímpares (Esperado [1, 3]): ");
        resultado.oddQueue.display();

        System.out.println("Fila original ficou vazia? (Esperado true): " + original.isEmpty());
    }
}