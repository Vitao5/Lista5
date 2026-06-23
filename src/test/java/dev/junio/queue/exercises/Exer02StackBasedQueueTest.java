package dev.junio.queue.exercises;

public class Exer02StackBasedQueueTest {
    public static void main(String[] args) {
        testeOperacoesFilaPilhas();
    }

    public static void testeOperacoesFilaPilhas() {
        System.out.println("\n--- [Questão 2] Teste Fila Utilizando Duas Pilhas ---");
        Exer02StackBasedQueue fila = new Exer02StackBasedQueue();

        fila.push(1);
        fila.push(2);
        fila.push(3);
        System.out.println("Tamanho atual (Esperado 3): " + fila.size());
        System.out.println("Elemento na frente (Esperado 1): " + fila.peek());

        System.out.println("Removido (Esperado 1): " + fila.pop());
        System.out.println("Novo elemento na frente (Esperado 2): " + fila.peek());
        System.out.println("Removido (Esperado 2): " + fila.pop());
        System.out.println("Removido (Esperado 3): " + fila.pop());

        System.out.println("Fila está vazia? (Esperado true): " + fila.isEmpty());
    }
}