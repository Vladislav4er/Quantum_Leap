package ru.javavlad.start;

import ru.javavlad.models.Item;
import java.util.Random;

public class Tracker {

    private Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * Метод добавляет новый элемент в массив items
     * и возвращает его.
     */
    public Item add(Item item) {
        item.setId(String.valueOf(System.currentTimeMillis() + RN.nextInt()));
        this.items[position++] = item;
        return  item;
    }

    /**
     * Метод обновляет элемент в массиве items с таким же id.
     */
    public void update(Item item) {
        for (int index = 0; index < this.position;) {
            if (this.items[index] != null && this.items[index].getId().equals(item.getId())) {
                this.items[index] = item;
                break;
            }
        }
    }

    /**
     * Метод удаляет элемент из массива.
     */
    public void delete(Item item) {
        for (int index = 0; index < this.position; index++) {
            if (this.items[index] != null && this.items[index].getId().equals(item.getId())) {
                System.arraycopy(items, index + 1, items, index, this.items.length - 1 - index);
                position--;
            }
        }
    }

    /**
     * Метод возвращает все созданные заявки в виде массива.
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int i = 0; i < this.position; i++) {
            result[i] = this.items[i];
        }
        return result;
    }

    /**
     * Поиск заявки по имени.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int j = 0;
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                result[j++] = item;

            }
        }
        Item[] result2 = new Item[j];
        for (int i = 0; i < j; i++) {
            result2[i] = result[i];
        }
        return result2;
    }

    /**
     * Поиск заявки по id
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Добавление комментария к заявке
     */
    public void addComment(String id, String comment) {
        for (int index = 0; index < position; index++) {
            if ((this.items[index] != null) && (this.items[index].getId().equals(id))) {
                this.items[index].setComment(comment);
                break;
            }
        }
    }
}
