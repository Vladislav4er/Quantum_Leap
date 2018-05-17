package ru.javavlad.start;

import ru.javavlad.models.Item;

/**
 * Внешний класс.
 */

class EditItem implements UserAction {
    public int key() {
        return 2;
    }
    public void execute(Input input, Tracker tracker) {
        String itemId = input.ask("Введите id заявки, которую хотите изменить:");
        if (tracker.findById(itemId) != null) {
            Item item1 = new Item();
            item1.setName(input.ask("Введите новое имя: "));
            item1.setDescription(input.ask("Введите новое описание: "));
            item1.setId(itemId);
            tracker.update(item1);
        } else {
            System.out.println("Такой заявки не существует");
        }
    }
    public String info() {
        return String.format("%s. %s", this.key(), "Edit item.");
    }
}

public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private  UserAction[] actions = new UserAction[7];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Заполнение меню.
     */

    public void fillActions() {
        this.actions[0] = this.new AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] = new EditItem();
        this.actions[3] = this.new DeleteItem();
        this.actions[4] = this.new FindItemById();
        this.actions[5] = this.new FindItemsByName();
        this.actions[6] = this.new Exit();
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Отображение меню.
     */

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Внутренний нестатический класс.
     */

    private class AddItem implements UserAction {
        public int key() {
            return 0;
        }
        public void execute(Input input, Tracker tracker) {
            Item item = new Item();
            String name = input.ask("Введите имя заявки ");
            item.setName(name);
            String description = input.ask("Введите описание заявки ");
            item.setDescription(description);
            tracker.add(item);
            System.out.println("Заявка " + item.getName() + " (описание: " + item.getDescription() + ")" + " добавлена. Id: " + item.getId());
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Add the new item.");
        }
    }

    /**
     * Внутренний статический класс.
     */

    private static class ShowItems implements  UserAction {
        public int key() {
            return 1;
        }
        public void execute(Input input, Tracker tracker) {
            if (tracker.findAll().length > 0) {
                System.out.println("Созданные заявки: ");
                for (int index = 0; index < tracker.findAll().length; index++) {
                    System.out.println("Заявка: " + tracker.findAll()[index].getName() + " с id " + tracker.findAll()[index].getId());
                }
            } else {
                System.out.println("Заявок нет\n");
            }
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items.");
        }
    }

    /**
     * Остальные внутренние классы.
     */

    private class DeleteItem implements UserAction {
        public int key() {
            return 3;
        }
        public void execute(Input input, Tracker tracker) {
            tracker.delete(tracker.findById(input.ask("Введите Id заявки ")));
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item.");
        }
    }

    private class FindItemById implements UserAction {
        public int key() {
            return 4;
        }
        public void execute(Input input, Tracker tracker) {
            Item item = tracker.findById(input.ask("Введите Id заявки "));
            System.out.println("Найдена заявка с именем: " + item.getName() + ". Описание: " + item.getDescription());
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by id.");
        }
    }

    private class FindItemsByName implements UserAction {
        public int key() {
            return 5;
        }
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Введите имя заявки ");
            for (int index = 0; index < tracker.findByName(name).length; index++) {
                System.out.println("Найдена заявка: " + name
                        + " (описание: " + tracker.findByName(name)[index].getDescription() + ")"
                        + " c id: " + tracker.findByName(name)[index].getId());
            }
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Find items by name.");
        }
    }

    private class Exit implements UserAction {
        public int key() {
            return 6;
        }
        public void execute(Input input, Tracker tracker) {
            System.exit(0);
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Exit Programm.");
        }
    }
}
