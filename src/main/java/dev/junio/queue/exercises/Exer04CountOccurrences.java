package dev.junio.queue.exercises;

import dev.junio.queue.linkedqueue.LinkedQueue;

public class Exer04CountOccurrences<T> {

    public static int countOccurrences(LinkedQueue<Integer> queue, int target) {

        LinkedQueue<Integer> listrest = new LinkedQueue<>();
        int count = 0;

        while (!queue.isEmpty()) {
            Integer current = queue.pop();


            if (current != null && current == target) {
                count++;
            }


            listrest.push(current);
        }

        while (!listrest.isEmpty()){
            queue.push(listrest.pop());
        }


        return count;
    }
}
