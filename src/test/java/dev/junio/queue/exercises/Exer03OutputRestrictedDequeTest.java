package dev.junio.queue.exercises;

public class Exer03OutputRestrictedDequeTest {
    public static void main(String[] args) {
        testeSaidaDupla();
    }

    public static void testeSaidaDupla() {
        System.out.println("\n--- [Questão 3] Teste Fila com Saída Dupla ---");
        Exer03OutputRestrictedDeque fila = new Exer03OutputRestrictedDeque(5);

        fila.push(10);
        fila.push(20);
        fila.push(30);

        System.out.println("Elemento do início (Esperado 10): " + fila.peek());
        System.out.println("Elemento do fim (Esperado 30): " + fila.back());

        System.out.println("Removendo do FINAL (Esperado 30): " + fila.popBack());
        System.out.println("Novo elemento do fim (Esperado 20): " + fila.back());
        System.out.println("Tamanho após remoção (Esperado 2): " + fila.size());
    }
}