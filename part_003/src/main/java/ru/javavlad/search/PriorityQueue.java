package ru.javavlad.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        if (tasks.isEmpty()) {
            tasks.add(task);
        }
        int i = 0;
        for (Task aTask : tasks) {
            if (task.getPriority() < aTask.getPriority()) {
                tasks.add(i, task);
                break;
            }
            i++;
        }
        if (!tasks.contains(task)) {
            tasks.add(task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }

}
