package dev.junio.queue.exercises;

public class Exer01ShiftPopTest {
    public static void main(String[] args) {
        testeDeslocamento();
        testeFilaVazia();
    }

    public static void testeDeslocamento() {
        System.out.println("\n--- [Questão 1] Teste Deslocamento Imediato (pop) ---");
        Exer01ShiftPop fila = new Exer01ShiftPop(5);

        fila.push(10);
        fila.push(20);
        fila.push(30);
        System.out.println("Fila atual após push (10, 20, 30). Tamanho atual: " + fila.size());

        System.out.println("Removendo elemento (Esperado 10): " + fila.pop());
        System.out.println("Nova frente após deslocamento (Esperado 20): " + fila.peek());
        System.out.println("Tamanho atual da fila (Esperado 2): " + fila.size());
    }

    public static void testeFilaVazia() {
        System.out.println("\n--- [Questão 1] Teste de Fila Vazia ---");
        Exer01ShiftPop fila = new Exer01ShiftPop(2);
        try {
            fila.pop();
        } catch (IllegalStateException e) {
            System.out.println("Capturou exceção esperada: " + e.getMessage());
        }
    }
}