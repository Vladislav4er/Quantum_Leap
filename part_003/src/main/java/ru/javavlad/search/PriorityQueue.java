package ru.javavlad.search;

import java.util.LinkedList;
import java.util.stream.IntStream;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = IntStream.range(0, tasks.size())
                .filter(taskInd -> task.getPriority() < tasks.get(taskInd).getPriority())
                .findFirst().orElse(tasks.size());
        tasks.add(index, task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}
