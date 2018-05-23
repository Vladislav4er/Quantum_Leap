package ru.javavlad.start;

import ru.javavlad.models.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        for (Item aItem : items) {
            if (aItem != null && aItem.getId().equals(item.getId())) {
                items.remove(aItem);
                break;
            }
        }
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
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                result.add(item);
            }
        } return result;
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
