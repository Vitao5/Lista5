# ED1 — Exercícios de Filas (Exercícios 1–6)

Projeto acadêmico desenvolvido para a disciplina de **Estrutura de Dados I (EDI)** no curso de Análise e Desenvolvimento de Sistemas (ADS) — IFTM Campus Patrocínio.

Implementa as estruturas de dados **Fila** e **Pilha** em duas variações (array e lista encadeada), além de seis exercícios práticos sobre operações com filas.

---

## Estrutura do Projeto

```
src/
├── main/java/dev/junio/
│   ├── queue/
│   │   ├── Queue.java                        # Interface genérica de Fila
│   │   ├── arrayqueue/
│   │   │   └── ArrayQueue.java               # Fila estática (array)
│   │   ├── linkedqueue/
│   │   │   └── LinkedQueue.java              # Fila dinâmica (lista encadeada)
│   │   └── exercises/
│   │       ├── Exer01ShiftPop.java           # Deslocamento imediato no pop
│   │       ├── Exer02StackBasedQueue.java    # Fila implementada com duas pilhas
│   │       ├── Exer03OutputRestrictedDeque.java  # Deque com saída dupla
│   │       ├── Exer04CountOccurrences.java   # Contagem de ocorrências
│   │       ├── Exer05MergeQueues.java        # Junção de filas ordenadas
│   │       └── Exer06SplitEvenOdd.java       # Separação par/ímpar
│   └── stack/
│       ├── Stack.java                        # Interface genérica de Pilha
│       ├── arraystack/
│       │   └── ArrayStack.java              # Pilha estática (array)
│       └── linkedstack/
│           └── LinkedStack.java             # Pilha dinâmica (lista encadeada)
└── test/java/dev/junio/queue/exercises/
    ├── Exer01ShiftPopTest.java
    ├── Exer02StackBasedQueueTest.java
    ├── Exer03OutputRestrictedDequeTest.java
    ├── Exer04CountOccurrencesTest.java
    ├── Exer05MergeQueuesTest.java
    └── Exer06SplitEvenOddTest.java
```

---

## Implementações Base

### Interface `Queue<T>`

Define o contrato comum para todas as filas:

| Método | Descrição |
|---|---|
| `push(T)` | Insere elemento no fim da fila (enqueue) |
| `pop()` | Remove e retorna o elemento do início (dequeue) |
| `peek()` | Retorna o elemento do início sem remover |
| `back()` | Retorna o elemento do fim sem remover |
| `size()` | Retorna o número de elementos |
| `isEmpty()` | Verifica se a fila está vazia |
| `clear()` | Remove todos os elementos |
| `display()` | Exibe o conteúdo da fila |

### `ArrayQueue<T>` — Fila Estática

Implementação baseada em array de capacidade fixa. O `pop()` realiza deslocamento imediato dos elementos para a esquerda, mantendo o índice `0` sempre como frente da fila.

### `LinkedQueue<T>` — Fila Dinâmica

Implementação com nós encadeados (`Node`). Mantém ponteiros para `head` (frente) e `tail` (fim), garantindo `push` e `pop` em O(1).

### Interface `Stack<T>`

Define o contrato para pilhas: `push`, `pop`, `peek`, `size`, `isEmpty`, `clear`.

### `ArrayStack<T>` — Pilha Estática

Pilha sobre array com capacidade fixa. Inclui método `fitsFull()` como verificação de lotação.

### `LinkedStack<T>` — Pilha Dinâmica

Pilha sobre lista encadeada. O nó `top` representa o topo; `push` e `pop` operam em O(1).

---

## Exercícios

### Exercício 1 — Deslocamento Imediato no `pop` (`Exer01ShiftPop`)

Estende `ArrayQueue` sem alterações adicionais, evidenciando que o comportamento de deslocamento dos elementos após `pop()` já está implementado na classe base — a cada remoção, todos os itens são movidos uma posição à esquerda.

```
push(10), push(20), push(30) → [10, 20, 30]
pop() → retorna 10, fila fica [20, 30]
peek() → 20
```

---

### Exercício 2 — Fila com Duas Pilhas (`Exer02StackBasedQueue`)

Simula o comportamento FIFO de uma fila utilizando **duas pilhas** (`pilhaEntrada` e `pilhaSaida`), ambas do tipo `LinkedStack`.

- `push`: sempre empilha em `pilhaEntrada`.
- `pop`/`peek`: se `pilhaSaida` estiver vazia, transfere todos os elementos de `pilhaEntrada` para `pilhaSaida` (invertendo a ordem), depois retira do topo de `pilhaSaida`.

```
push(1), push(2), push(3)
pop() → 1
pop() → 2
pop() → 3
```

---

### Exercício 3 — Deque com Saída Dupla (`Exer03OutputRestrictedDeque`)

Estende `ArrayQueue` adicionando o método `popBack()`, que permite remover elementos tanto do **início** (via `pop()` herdado) quanto do **fim** da fila, implementando assim um Output-Restricted Deque.

```
push(10), push(20), push(30)
popBack() → 30
back() → 20
```

---

### Exercício 4 — Contagem de Ocorrências (`Exer04CountOccurrences`)

Conta quantas vezes um valor `target` aparece em uma `LinkedQueue<Integer>`, **preservando a fila original** após a contagem. Para isso, utiliza uma fila auxiliar que armazena os elementos removidos e os reinsere ao final.

```java
LinkedQueue<Integer> fila = [5, 10, 5, 20]
countOccurrences(fila, 5) → 2
// fila continua [5, 10, 5, 20] após a chamada
```

---

### Exercício 5 — Junção de Filas Ordenadas (`Exer05MergeQueues`)

Recebe duas `LinkedQueue<Integer>` previamente ordenadas e retorna uma nova fila com todos os elementos intercalados em **ordem crescente** (merge sort–style). As filas originais são consumidas no processo.

```
q1 = [1, 3, 5]
q2 = [2, 4, 6]
mergeTwoQueues(q1, q2) → [1, 2, 3, 4, 5, 6]
```

---

### Exercício 6 — Separação Par/Ímpar (`Exer06SplitEvenOdd`)

Percorre uma `LinkedQueue<Integer>` e distribui os elementos em duas filas separadas: `evenQueue` (pares) e `oddQueue` (ímpares). A fila original é consumida no processo. O resultado é retornado em um objeto interno `Result`.

```
original = [1, 4, 3, 2]
evenQueue → [4, 2]
oddQueue  → [1, 3]
```

---

## Como Executar

O projeto utiliza **IntelliJ IDEA** (configuração `.idea` inclusa). Cada exercício possui sua própria classe de teste com método `main`.

1. Abra o projeto no IntelliJ IDEA.
2. Navegue até `src/test/java/dev/junio/queue/exercises/`.
3. Execute a classe de teste desejada (`ExerXXTest.java`) diretamente.

Não há dependências externas — o projeto usa apenas a biblioteca padrão do Java.

---

## Tecnologias

- **Java** (sem frameworks)
- **IntelliJ IDEA**
- Paradigma: Orientação a Objetos com Generics (`<T>`)
