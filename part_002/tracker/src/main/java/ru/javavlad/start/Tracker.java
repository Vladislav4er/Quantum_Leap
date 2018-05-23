package ru.javavlad.start;

import ru.javavlad.models.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Tracker {

    private List<Item> items = new ArrayList<Item>();
    private static final Random RN = new Random();

    /**
     * Метод добавляет новый элемент в массив items
     * и возвращает его.
     */
    public Item add(Item item) {
        item.setId(String.valueOf(System.currentTimeMillis() + RN.nextInt()));
        items.add(item);
        return  item;
    }

    /**
     * Метод обновляет элемент в массиве items с таким же id.
     */
    public void update(Item item) {
        for (Item aItem : items) {
            if (aItem != null && aItem.getId().equals(item.getId())) {
                items.remove(aItem);
                items.add(item);
                break;
            }
        }
    }

    /**
     * Метод удаляет элемент из массива.
     */
    public void delete(Item item) {
        this.items.removeIf(aItem -> item.getId().equals(aItem.getId()));
    }

    /**
     * Метод возвращает все созданные заявки в виде массива.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Поиск заявки по имени.
     */
    public List<Item> findByName(String key) {
        return this.items.stream().filter(item -> item != null && item.getName().equals(key))
                                    .collect(Collectors.toList());
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
}
