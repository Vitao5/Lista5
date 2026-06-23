package dev.junio.queue.exercises;

import dev.junio.queue.linkedqueue.LinkedQueue;

public class Exer04CountOccurrencesTest {
    public static void main(String[] args) {
        testeContagemPreservada();
    }

    public static void testeContagemPreservada() {
        System.out.println("\n--- [Questão 4] Teste Contagem com Estrutura Preservada ---");
        LinkedQueue<Integer> fila = new LinkedQueue<>();
        fila.push(5);
        fila.push(10);
        fila.push(5);
        fila.push(20);

        int total = Exer04CountOccurrences.countOccurrences(fila, 5);
        System.out.println("Ocorrências do número 5 (Esperado 2): " + total);
        System.out.println("Tamanho após contagem (Esperado 4): " + fila.size());

        System.out.print("Verificando se a ordem foi mantida: ");
        fila.display(); // Deve printar [5, 10, 5, 20]
    }
}